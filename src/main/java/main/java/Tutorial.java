package main.java;
import java.util.ArrayList;

public class Tutorial {
    private String codeName;
    private final Pair<Integer, Pair<Integer, Integer>> time;

    public Tutorial(String codeName, Pair<Integer, Pair<Integer, Integer>> time) {
        this.codeName = codeName;
        this.time = time;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Pair<Integer, Pair<Integer, Integer>> getTime() {
        return time;
    }


    @Override
    public String toString() {
         return "Tutorial{" +
                    "codeName=" + codeName +
                    time.toString() +
                    '}';
    }
}
