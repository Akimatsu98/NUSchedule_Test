package main.java;

import java.util.ArrayList;

public class LectureSetDifferentiator {
    ArrayList<ArrayList<Lecture>> list = new ArrayList<>();

    void add(ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> ls) {
        ArrayList<Lecture> temp = new ArrayList<>();
        for (Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> item : ls) {
            temp.add(item.getLeft());
        }
        list.add(temp);
    }

    boolean contains(ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> ls) {
        ArrayList<Lecture> temp = new ArrayList<>();
        for (Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> item : ls) {
            temp.add(item.getLeft());
        }
        for (ArrayList<Lecture> itemList : list) {
            int iterator = 0;
            for (Lecture item : itemList) {
                if (!temp.contains(item)) {
                    break;
                } else if (iterator++ == temp.size() - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
