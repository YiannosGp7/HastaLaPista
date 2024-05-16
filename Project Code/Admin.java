public class Admin extends User {
    public Admin(int userId, String userType, String username, String password, String email) {
        super(userId, userType, username, password, email);
    }

    public void addTrack() {
        System.out.println("Admin: Track added.");
    }

    public void removeTrack() {
        System.out.println("Admin: Track removed.");
    }

    public void updateTrack() {
        System.out.println("Admin: Track updated.");
    }

    public void addAd() {
        System.out.println("Admin: Ad added.");
    }

    public void removeAd() {
        System.out.println("Admin: Ad removed.");
    }

    public void updateAd() {
        System.out.println("Admin: Ad updated.");
    }

    public void processRequest() {
        System.out.println("Admin: Request processed.");
    }

    public void viewReservations() {
        System.out.println("Admin: Viewing reservations.");
    }
}
