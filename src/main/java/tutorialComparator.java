package main.java;

import java.util.ArrayList;
import java.util.Comparator;

public class tutorialComparator implements Comparator<ArrayList<Tutorial>> {
    @Override
    public int compare(ArrayList<Tutorial> l1, ArrayList<Tutorial> l2) {
        int totalPreferencel1 = 0;
        int totalPreferencel2 = 0;
        for (Tutorial t : l1) {
            totalPreferencel1 += t.getPreference();
        }
        for (Tutorial t : l2) {
            totalPreferencel2 += t.getPreference();
        }

        if (totalPreferencel1 < totalPreferencel2) {
            return 1;
        } else if (totalPreferencel1 > totalPreferencel2) {
            return -1;
        } else {
            return 0;
        }
    }
}
