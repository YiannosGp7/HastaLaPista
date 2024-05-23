public class Renter extends User {
    private int age;

    public Renter(int userId, String userType, String username, String password, String email, int age) {
        super(userId, userType, username, password, email);
        this.age = age;
    }

    // Getters
    public int getAge() { return age; }

    // Setters
    public void setAge(int age) { this.age = age; }

    public void reserveTrack() {
        System.out.println("Renter: Track reserved.");
    }

    public void setFilters() {
        System.out.println("Renter: Filters set.");
    }

    public void myReservations() {
        System.out.println("Renter: Viewing my reservations.");
    }

    public void contact() {
        System.out.println("Renter: Contact made.");
    }

    public void receiveConfEmail() {
        System.out.println("Renter: Confirmation email received.");
    }
}
