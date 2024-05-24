public class Main {
    public static void main(String[] args) {
        // Creating users
        Admin admin = new Admin(1, "admin", "adminUser", "adminPass", "admin@example.com");
        TrackOwner trackOwner = new TrackOwner(2, "trackOwner", "ownerUser", "ownerPass", "owner@example.com", 500, 200.0, "Basic Equipment", "Cars", "Location A");
        Renter renter = new Renter(3, "renter", "renterUser", "renterPass", "renter@example.com", 30);
        Advertiser advertiser = new Advertiser(4, "advertiser", "advertUser", "advertPass", "advert@example.com", 30, 500.0, "Product A");
    

        // Admin actions
        System.out.println("Admin actions:");
        admin.addTrack();
        admin.removeTrack();
        admin.updateTrack();
        admin.addAd();
        admin.removeAd();
        admin.updateAd();
        admin.processRequest();
        admin.viewReservations();
    
    
    
    
    
    
    
    
    
    
    
    
    }
}