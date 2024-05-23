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
     public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public void process() {
        // process request
    }

    public void sendConfirmationEmail() {
        System.out.println("Confirmation email sent to: " + this.email);
    }
}