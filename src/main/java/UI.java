import java.util.ArrayList;

public class UI {
    public static void main(String[] args) {
        System.out.println("Scheduling preset modules...>< \n");

        ArrayList<Tutorial> ST3248_tuts = new ArrayList<>();
        ST3248_tuts.add(new Tutorial("ST3248", new Pair(2, new Pair(13, 14)), 10));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> ST3248_lects = new ArrayList<>();
        ST3248_lects.add(new Pair(0, new Pair(12, 14)));

        ArrayList<Tutorial> CS4234_tuts = new ArrayList<>();
        CS4234_tuts.add(new Tutorial("CS4234", new Pair(0, new Pair(14, 15)), 8));
        CS4234_tuts.add(new Tutorial("CS4234", new Pair(0, new Pair(11, 12)), 8));
        CS4234_tuts.add(new Tutorial("CS4234", new Pair(0, new Pair(17, 18)), 8));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> CS4234_lects = new ArrayList<>();
        CS4234_lects.add(new Pair(3, new Pair(12, 14)));

        ArrayList<Tutorial> CS3243_tuts = new ArrayList<>();
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(1, new Pair(10, 11)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(1, new Pair(11, 12)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(1, new Pair(16, 17)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(1, new Pair(17, 18)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(2, new Pair(8, 9)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(2, new Pair(9, 10)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(2, new Pair(12, 13)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(2, new Pair(13, 14)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(2, new Pair(14, 15)), 3));
        CS3243_tuts.add(new Tutorial("CS3243", new Pair(2, new Pair(15, 16)), 3));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> CS3243_lects = new ArrayList<>();
        CS3243_lects.add(new Pair(2, new Pair(10, 12)));

        ArrayList<Tutorial> ST2132_tuts = new ArrayList<>();
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(9, 10)), 10));
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(10, 11)), 10));
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(11, 12)), 10));
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(12, 13)), 10));
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(13, 14)), 10));
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(14, 15)), 10));
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(15, 16)), 10));
        ST2132_tuts.add(new Tutorial("ST2132", new Pair(1, new Pair(16, 17)), 10));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> ST2132_lects = new ArrayList<>();
        ST2132_lects.add(new Pair(2, new Pair(14, 16)));
        //ST2132_lects.add(new Pair(4, new Pair(14, 16)));

        ArrayList<Tutorial> LAJ1201_tuts = new ArrayList<>();
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(0, new Pair(8, 10)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(0, new Pair(10, 12)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(0, new Pair(12, 14)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(0, new Pair(14, 16)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(0, new Pair(16, 18)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(0, new Pair(18, 20)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(1, new Pair(10, 12)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(1, new Pair(12, 14)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(1, new Pair(14, 16)), 5));
        LAJ1201_tuts.add(new Tutorial("LAJ1201", new Pair(1, new Pair(16, 18)), 5));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> LAJ1201_lects = new ArrayList<>();
        LAJ1201_lects.add(new Pair(1, new Pair(14, 16)));
        LAJ1201_lects.add(new Pair(1, new Pair(12, 14)));
        LAJ1201_lects.add(new Pair(0, new Pair(14, 16)));
        LAJ1201_lects.add(new Pair(0, new Pair(16, 18)));
        LAJ1201_lects.add(new Pair(0, new Pair(18, 20)));

        ArrayList<Tutorial> CS2102_tuts = new ArrayList<>();
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(8, 9)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(9, 10)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(10, 11)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(11, 12)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(14, 15)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(15, 16)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(16, 17)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(1, new Pair(17, 18)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(2, new Pair(10, 11)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(2, new Pair(11, 12)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(2, new Pair(14, 15)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(2, new Pair(15, 16)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(2, new Pair(12, 13)), 8));
        CS2102_tuts.add(new Tutorial("CS2102", new Pair(2, new Pair(13, 14)), 8));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> CS2102_lects = new ArrayList<>();
        CS2102_lects.add(new Pair(1, new Pair(12, 14)));

        ArrayList<Tutorial> CS3203_tuts = new ArrayList<>();
        CS3203_tuts.add(new Tutorial("CS3203", new Pair(1, new Pair(10, 12)), 1));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> CS3203_lects = new ArrayList<>();
        CS3203_lects.add(new Pair(1, new Pair(12, 14)));

        ArrayList<Tutorial> CS3210_tuts = new ArrayList<>();
        CS3210_tuts.add(new Tutorial("CS3210", new Pair(0, new Pair(16, 18)), 5));
        CS3210_tuts.add(new Tutorial("CS3210", new Pair(1, new Pair(10, 12)), 5));
        CS3210_tuts.add(new Tutorial("CS3210", new Pair(1, new Pair(12, 14)), 5));
        CS3210_tuts.add(new Tutorial("CS3210", new Pair(1, new Pair(14, 16)), 5));
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> CS3210_lects = new ArrayList<>();
        CS3210_lects.add(new Pair(0, new Pair(14, 16)));

        Lecture l1 = new Lecture("ST3248", ST3248_lects, ST3248_tuts, 4, 10);
        Lecture l2 = new Lecture("CS2102", CS2102_lects, CS2102_tuts,  4, 8);
        Lecture l3 = new Lecture("LAJ1201", LAJ1201_lects, LAJ1201_tuts,  4, 5);
        Lecture l4 = new Lecture("CS3243", CS3243_lects, CS3243_tuts, 4, 3);
        Lecture l5 = new Lecture("ST2132", ST2132_lects, ST2132_tuts,  4, 10);
        Lecture l6 = new Lecture("CS4234", CS4234_lects, CS4234_tuts,  4, 8);
        Lecture l7 = new Lecture("CS3203", CS3203_lects, CS3203_tuts,  4, 1);
        Lecture l8 = new Lecture("CS3210", CS3210_lects, CS3210_tuts,  4, 5);

        ArrayList<Lecture> lectures = new ArrayList<>();
        lectures.add(l1);
        lectures.add(l2);
        lectures.add(l3);
        lectures.add(l4);
        lectures.add(l5);
        lectures.add(l6);
        lectures.add(l7);
        lectures.add(l8);

        Scheduler sch = new Scheduler(lectures);

        long starttime = System.nanoTime();

        sch.schedule_modules(0, 24);

        long endtime = System.nanoTime();

        sch.printModuleInfo();

        System.out.println("Total time taken: ");

        System.out.println(endtime - starttime);
    }
}
