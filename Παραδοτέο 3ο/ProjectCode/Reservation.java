import java.util.Date;

import javax.sound.midi.Track;

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

    // Getters and Setters
    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public Date getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(Date reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}
