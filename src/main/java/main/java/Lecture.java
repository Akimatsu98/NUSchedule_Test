package main.java;
import java.util.ArrayList;

public class Lecture {
    private final String codeName;
    private final ArrayList<Pair<Integer, Pair<Integer, Integer>>> times;
    private final ArrayList<Tutorial> availableTuts;
    private final int MC;

    public Lecture(String codeName, ArrayList<Pair<Integer, Pair<Integer, Integer>>> times, ArrayList<Tutorial> availableTuts, int MC) {
        this.codeName = codeName;
        this.times = times;
        this.availableTuts = availableTuts;
        this.MC = MC;

    }

    public ArrayList<Pair<Integer, Pair<Integer, Integer>>> getTimes() {
        return times;
    }

    public ArrayList<Tutorial> getAvailableTuts() {
        return availableTuts;
    }

    public String getCodeName() {
        return codeName;
    }


    public int getMC() {
        return MC;
    }


    @Override
    public String toString() {
        String finalString = "";
        for (Pair<Integer, Pair<Integer, Integer>> time : times) {
            finalString += "Lecture{" +
                    "codeName=" + codeName +
                    time.toString() +
                    '}';
        }
        return finalString;
    }
}
