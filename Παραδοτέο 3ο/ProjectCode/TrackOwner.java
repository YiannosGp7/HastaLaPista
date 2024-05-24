public class TrackOwner extends User {
    private int trackLength;
    private double trackPrice;
    private String trackEquipment;
    private String trackVehicles;
    private String trackLocation;

    public TrackOwner(int userId, String userType, String username, String password, String email, int trackLength, double trackPrice, String trackEquipment, String trackVehicles, String trackLocation) {
        super(userId, userType, username, password, email);
        this.trackLength = trackLength;
        this.trackPrice = trackPrice;
        this.trackEquipment = trackEquipment;
        this.trackVehicles = trackVehicles;
        this.trackLocation = trackLocation;
}

    // Getters
    public int getTrackLength() { return trackLength; }
    public double getTrackPrice() { return trackPrice; }
    public String getTrackEquipment() { return trackEquipment; }
    public String getTrackVehicles() { return trackVehicles; }
    public String getTrackLocation() { return trackLocation; }

    // Setters
    public void setTrackLength(int trackLength) { this.trackLength = trackLength; }
    public void setTrackPrice(double trackPrice) { this.trackPrice = trackPrice; }
    public void setTrackEquipment(String trackEquipment) { this.trackEquipment = trackEquipment; }
    public void setTrackVehicles(String trackVehicles) { this.trackVehicles = trackVehicles; }
    public void setTrackLocation(String trackLocation) { this.trackLocation = trackLocation; }

    public void sendRequest() {
        System.out.println("TrackOwner: Request sent.");
    }

    public void fillForm() {
        System.out.println("TrackOwner: Form filled.");
    }

    public void contact() {
        System.out.println("TrackOwner: Contact made.");
    }

    public void myRequests() {
        System.out.println("TrackOwner: Viewing my requests.");
    }
}
