import java.util.ArrayList;

public class User {
    private int userId;
    private String handleName;
    private String password; // TODO hash
    private ArrayList<String> completedClimbs;
    private ArrayList<String> createdClimbs;


    public User(String handlename, String password) {
        this.handleName = handlename;
        this.password = password;
        this.userId = -1; // TODO: create userId generation method
        this.completedClimbs = new ArrayList<String>();
        this.createdClimbs = new ArrayList<String>();
    }


    public boolean tryLogin(String password) {
        return this.password.equals(password);
    }


    public void addUserCompleted(String climbId) {
        completedClimbs.add(climbId);
    } 

    public void createClimb(String climbId) {
        createdClimbs.add(climbId);
    }

}
