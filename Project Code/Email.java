public class Email {
    private int reservationId;
    private String reservationDateTime;
    private Track track;
    private User user;
    private int requestId;

    public Email(int reservationId, String reservationDateTime, Track track, User user, int requestId) {
        this.reservationId = reservationId;
        this.reservationDateTime = reservationDateTime;
        this.track = track;
        this.user = user;
        this.requestId = requestId;
    }

    // Getters
    public int getReservationId() { return reservationId; }
    public String getReservationDateTime() { return reservationDateTime; }
    public Track getTrack() { return track; }
    public User getUser() { return user; }
    public int getRequestId() { return requestId; }

    // Setters
    public void setReservationId(int reservationId) { this.reservationId = reservationId; }
    public void setReservationDateTime(String reservationDateTime) { this.reservationDateTime = reservationDateTime; }
    public void setTrack(Track track) { this.track = track; }
    public void setUser(User user) { this.user = user; }
    public void setRequestId(int requestId) { this.requestId = requestId; }

    public void createEmail() {
        // Implementation for creating email
    }

    public void getRequestID() {
        // Implementation for getting request ID
    }
}
