import java.util.Map;
import java.util.ArrayList;

public class Controller {
    private static Map<String, User> users;
    private static Map<String, Climb> climbs;
    // store the actual image/render of the bouldering 


    public boolean logIn(String handleName, String password) {
        return users.get(handleName).tryLogin(password);
    }

    // TODO: smogerino
    public void logOut(String userId, String password) {}

    public boolean makeAccount(String userId, String password) { 
        if (users.containsKey(userId)) {
            return false;
        }
        users.put(userId, new User(userId, password));
        return true;
    }

    public void editUserInfo() {}

    public void logCompletedClimb(String userId, String climbId) {
        users.get(userId).addUserCompleted(climbId);
        climbs.get(climbId).addUserCompleted(userId);
    }


    public boolean createNewClimb(ArrayList<Integer> startHolds, ArrayList<Integer> finishHolds, ArrayList<Integer> footHolds,
    ArrayList<Integer> eitherHolds, String climbId, int grade, String userId) {
        if (climbs.containsKey(climbId)) {
            return false;
        }
        Holds newClimbHolds = new Holds(startHolds, finishHolds, footHolds, eitherHolds);
        Climb newClimb = new Climb(climbId, grade, newClimbHolds, climbId);
        climbs.put(climbId, newClimb);
        users.get(userId).createClimb(climbId);
        return true;
    }


    public void listClimbNames() {
        ArrayList<String> climbNames = new ArrayList<String>(climbs.keySet());
    }

    public void deleteClimb(String userId, String climbId) {
        // two things, delete from the list of clibms
        // delete from the user
        if (climbs.get(climbId).)
    }
    public void getClimbInfo() {

    }


    // TODO: comment functionality for later
    // public void commentOnClimb() {}
    // public void deleteComment() {}

}
