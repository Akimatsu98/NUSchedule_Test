import java.util.ArrayList;
import java.util.Comparator;

public class lectureComparator implements Comparator<ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>>> {

    @Override
    public int compare(ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> l1, ArrayList<Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>>> l2) {
        int totalPreferencel1 = 0;
        int totalPreferencel2 = 0;
        for (Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> set : l1) {
            totalPreferencel1 += set.getLeft().getPreference();
        }
        for (Pair<Lecture, Pair<Integer, Pair<Integer, Integer>>> set : l2) {
            totalPreferencel2 += set.getLeft().getPreference();
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
