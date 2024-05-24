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
    
    
        // TrackOwner actions
        System.out.println("\nTrackOwner actions:");
        trackOwner.sendRequest();
        trackOwner.fillForm();
        trackOwner.contact();
        trackOwner.myRequests();

        // Print trackOwner details
        System.out.println("TrackOwner details:");
        System.out.println("Track Length: " + trackOwner.getTrackLength());
        System.out.println("Track Price: " + trackOwner.getTrackPrice());
        System.out.println("Track Equipment: " + trackOwner.getTrackEquipment());
        System.out.println("Track Vehicles: " + trackOwner.getTrackVehicles());
        System.out.println("Track Location: " + trackOwner.getTrackLocation());

        // Renter actions
        System.out.println("\nRenter actions:");
        renter.reserveTrack();
        renter.setFilters();
        renter.myReservations();
        renter.contact();
        renter.receiveConfEmail();

        // Print renter details
        System.out.println("Renter details:");
        System.out.println("Age: " + renter.getAge());
        
    
    
    
    
    
    
    
    
    }
}