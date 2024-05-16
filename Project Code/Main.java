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

        // Advertiser actions
        System.out.println("\nAdvertiser actions:");
        advertiser.sendRequest();
        advertiser.fillForm();
        advertiser.contact();
        advertiser.myRequests();

        // Print advertiser details
        System.out.println("Advertiser details:");
        System.out.println("Ad Duration: " + advertiser.getAdDuration());
        System.out.println("Offered Money: " + advertiser.getOfferedMoney());
        System.out.println("Product: " + advertiser.getProduct());

        // Creating a cart
        Cart cart = new Cart();

        // Creating some products
        Product product1 = new Product(1, "Product 1", 10.0, "Info for Product 1");
        Product product2 = new Product(2, "Product 2", 20.0, "Info for Product 2");
        Product product3 = new Product(3, "Product 3", 15.0, "Info for Product 3");

        // Adding items to the cart
        System.out.println("\nAdding items to the cart:");
        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);

        // Viewing items in the cart
        System.out.println("\nViewing items in the cart:");
        cart.viewItems();

        // Removing an item from the cart
        System.out.println("\nRemoving an item from the cart:");
        cart.removeItem(product2);
        cart.viewItems();

        // Checking out
        System.out.println("\nChecking out:");
        cart.checkout();
    }
}
