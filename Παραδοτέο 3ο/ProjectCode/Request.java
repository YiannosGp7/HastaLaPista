public class Request {
    private User user;
    private String requestType;
    private String email;
    private int requestID;

    public Request(User user, String requestType, String email, int requestID) {
        this.user = user;
        this.requestType = requestType;
        this.email = email;
        this.requestID = requestID;
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }