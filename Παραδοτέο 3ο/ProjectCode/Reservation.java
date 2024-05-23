import java.util.Date;

public class Reservation {
    private int reservationID;
    private Date reservationDateTime;
    private Renter renter;
    private Track track;

    public Reservation(int reservationID, Date reservationDateTime, Renter renter, Track track) {
        this.reservationID = reservationID;
        this.reservationDateTime = reservationDateTime;
        this.renter = renter;
        this.track = track;
    }
