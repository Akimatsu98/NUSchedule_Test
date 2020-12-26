package main.java;

public class Tutorial {
    private String codeName;
    private final Pair<Integer, Pair<Integer, Integer>> time;
    private int preference;

    public Tutorial(String codeName, Pair<Integer, Pair<Integer, Integer>> time, int preference) {
        this.codeName = codeName;
        this.time = time;
        this.preference = preference;
    }

    public int getPreference() {
        return preference;
    }

    public String getCodeName() {
        return codeName;
    }

    public Pair<Integer, Pair<Integer, Integer>> getTime() {
        return time;
    }

}
