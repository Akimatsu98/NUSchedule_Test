package main.java;
import java.util.ArrayList;
import java.util.Objects;

public class Lecture {
    private final String codeName;
    private final ArrayList<Pair<Integer, Pair<Integer, Integer>>> times;
    private final ArrayList<Tutorial> availableTuts;
    private final int MC;
    private final int preference;  // from 1 to 10

    public Lecture(String codeName, ArrayList<Pair<Integer, Pair<Integer, Integer>>> times, ArrayList<Tutorial> availableTuts, int MC, int preference) {
        this.codeName = codeName;
        this.times = times;
        this.availableTuts = availableTuts;
        this.MC = MC;
        this.preference = preference;
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

    public int getPreference() {
        return preference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return MC == lecture.MC && preference == lecture.preference && Objects.equals(codeName, lecture.codeName) && Objects.equals(times, lecture.times) && Objects.equals(availableTuts, lecture.availableTuts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeName, times, availableTuts, MC, preference);
    }
}
