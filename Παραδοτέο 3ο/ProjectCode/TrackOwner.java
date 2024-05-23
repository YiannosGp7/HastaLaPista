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
