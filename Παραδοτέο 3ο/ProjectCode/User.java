public class User {
    protected int userID;
    protected String userType;
    protected String username;
    protected String password;
    protected String email;

    public User(int userID, String userType, String username, String password, String email) {
        this.userID = userID;
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void register() {
        // registration logic
    }

    public boolean login(String username, String password) {
        // login logic
        return true;
    }

    public void logout() {
        // logout logic
    }

    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
