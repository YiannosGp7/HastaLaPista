public class Admin extends User {

    public Admin(int userID, String username, String password, String email) {
        super(userID, "Admin", username, password, email);
    }

    public void approveTrackRequest() {
        // logic to approve track request
    }

    public void approveAdRequest() {
        // logic to approve ad request
    }
}
