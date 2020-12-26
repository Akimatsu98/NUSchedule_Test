package main.java;
import java.util.ArrayList;
import java.util.HashSet;

public class Scheduler {

    private final ArrayList<Lecture> lectures; // sorted by starting time and day

    private ArrayList<ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>>> lectureResultList = new ArrayList<>(); // stores max 10 results

    private ArrayList<ArrayList<Tutorial>> tutorialResultList = new ArrayList<>();

    private boolean[][] slots = new boolean[5][24]; // day 0 means Monday

    private HashSet<Lecture> lhs = new HashSet<>();

    private int maxSizeFound = -100;

    // temporary list storage
    ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> llist = new ArrayList<>();

    ArrayList<Tutorial> tlist = new ArrayList<>();


    public Scheduler(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 24; j++) {
                slots[i][j] = false; // false means not taken
            }
        }
    }

    // Issues:
    // 1. a single module does not require multiple lecture/tutorial slots
    // 2. preferences not considered
    // 3. prioritise combinations that are as distinct
    // as possible: different sets of modules, not just minor tutorial slots difference
    // 4. reduce and limit the number of combinations displayed
    void schedule_modules(int cur, int maxMC) {
        if ((maxMC <= 0 || cur == lectures.size()) && maxSizeFound <= llist.size()) {
            maxSizeFound = llist.size();
            if (lectureResultList.size() <= 1500000) {
                ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> llist_new = deepCopyLecture(llist);
                lectureResultList.add(llist_new);
            }
            if (tutorialResultList.size() <= 1500000) {
                ArrayList<Tutorial> tList_new = new ArrayList<>();
                for (Tutorial t : tlist) {
                    tList_new.add(t);
                }
                tutorialResultList.add(tList_new);
            }
            return;
        }

        if (lectures.subList(cur, lectures.size()).size() + llist.size() < maxSizeFound) return; // pruning heuristic

        for (Lecture lecture : lectures.subList(cur, lectures.size())) {
            if (!lhs.contains(lecture)) {
                for (Pair<Integer, Pair<Integer, Integer>> time : lecture.getTimes()) {
                    int date = time.getLeft();
                    Pair<Integer, Integer> timeslot = time.getRight();
                    if (!checkConflict(date, timeslot, slots)) {
                        Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> lectureCandidate = new Pair(lecture, time);
                        llist.add(lectureCandidate);
                        lhs.add(lecture);
                        for (int a = timeslot.getLeft(); a <= timeslot.getRight() - 1; a++) slots[date][a] = true;
                        ArrayList<Tutorial> tuts = lecture.getAvailableTuts();
                        for (Tutorial t : tuts) {
                            Pair<Integer, Pair<Integer, Integer>> tslot = t.getTime();
                            int tdate = tslot.getLeft();
                            Pair<Integer, Integer> ttimeslot = tslot.getRight();
                            if (!checkConflict(tdate, ttimeslot, slots)) {
                                tlist.add(t);
                                for (int a = ttimeslot.getLeft(); a <= ttimeslot.getRight() - 1; a++)
                                    slots[tdate][a] = true;
                                schedule_modules(lectures.indexOf(lecture) + 1, maxMC - lecture.getMC());
                                tlist.remove(t);
                                for (int a = ttimeslot.getLeft(); a <= ttimeslot.getRight() - 1; a++)
                                    slots[tdate][a] = false;
                            }
                        }
                        for (int a = timeslot.getLeft(); a <= timeslot.getRight() - 1; a++) slots[date][a] = false;
                        llist.remove(lectureCandidate);
                        lhs.remove(lecture);
                    }
                }
            }
        }
        return;
    }

    private ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> deepCopyLecture(ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> llist) {
        ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> newList = new ArrayList<>();
        for (Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> a : llist) {
            newList.add(a);
        }
        return newList;
    }


    static boolean checkConflict(int date, Pair<Integer, Integer> time, boolean[][] slots) {
        boolean isConflict = false;
        for (int a = time.getLeft(); a <= time.getRight() - 1; a++) {
            if (slots[date][a]) {
                isConflict = true;
                return isConflict;
            }
        }
        return isConflict;
    }

    void printModuleInfo() {
        int lectSetCount = 0;
        int iterator = 0;
        for (ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> a : lectureResultList) {
            System.out.println("Lecture Info:");
            lectSetCount++;
            for (Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> b : a) {
                printLectureInfo(b);
            }
            System.out.println("Tutorial Info:");
            printTutorialInfo(tutorialResultList.get(iterator));
            iterator++;
            if (lectSetCount == 160000) break;
            System.out.println("");
        }

        System.out.println("\nIn total " + lectSetCount + " combinations found!\n");
    }

    private void printTutorialInfo(ArrayList<Tutorial> tlist) {
        for (Tutorial t : tlist) {
            System.out.println(t.getCodeName() + " tutorial: On Day " + t.getTime().getLeft() + " " + t.getTime().getRight().toString());
        }
    }

    private void printLectureInfo(Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> a) {
        System.out.println(a.getLeft().getCodeName() + ": On Day " + a.getRight().getLeft() + " " + a.getRight().getRight().toString());
    }
}
