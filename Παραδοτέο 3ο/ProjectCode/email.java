public class Email {
    private int emailID;
    private Reservation reservation;
    private String subject;
    private String body;

    public Email(int emailID, Reservation reservation, String subject, String body) {
        this.emailID = emailID;
        this.reservation = reservation;
        this.subject = subject;
        this.body = body;
    }

    // Getters and Setters
    public int getEmailID() {
        return emailID;
    }

    public void setEmailID(int emailID) {
        this.emailID = emailID;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getSubject() {
        return subject;