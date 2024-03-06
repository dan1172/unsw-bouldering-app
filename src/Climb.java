import java.util.ArrayList;

public class Climb {
    private String name;
    private int grade;
    private Holds holds;
    private String description;
    private String creator;
    private ArrayList<String> completedClimbers;
    // TODO : add comments functionality later

    public Climb(String name, int grade, Holds holds, String description, String creator) {
        this.name = name;
        this.grade = grade;
        this.holds = holds;
        this.description = description;
        this.completedClimbers = new ArrayList<String>();
    }

    public void addUserCompleted(String userId) {
        completedClimbers.add(userId);
    }



}
