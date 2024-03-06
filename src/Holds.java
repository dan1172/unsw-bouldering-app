import java.util.ArrayList;

public class Holds {
    private ArrayList<Integer> startHolds;
    private ArrayList<Integer> finishHolds;
    private ArrayList<Integer> footHolds;
    private ArrayList<Integer> eitherHolds;


    public Holds(ArrayList<Integer> startHolds, ArrayList<Integer> finishHolds, ArrayList<Integer> footHolds,
            ArrayList<Integer> eitherHolds) {
        this.startHolds = startHolds;
        this.finishHolds = finishHolds;
        this.footHolds = footHolds;
        this.eitherHolds = eitherHolds;
    }

    public ArrayList<Integer> getStartHolds() {
        return startHolds;
    }
    public void setStartHolds(ArrayList<Integer> startHolds) {
        this.startHolds = startHolds;
    }
    public ArrayList<Integer> getFinishHolds() {
        return finishHolds;
    }
    public void setFinishHolds(ArrayList<Integer> finishHolds) {
        this.finishHolds = finishHolds;
    }
    public ArrayList<Integer> getFootHolds() {
        return footHolds;
    }
    public void setFootHolds(ArrayList<Integer> footHolds) {
        this.footHolds = footHolds;
    }
    public ArrayList<Integer> getEitherHolds() {
        return eitherHolds;
    }
    public void setEitherHolds(ArrayList<Integer> eitherHolds) {
        this.eitherHolds = eitherHolds;
    }


    
}
