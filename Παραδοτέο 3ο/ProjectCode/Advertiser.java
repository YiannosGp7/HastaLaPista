public class Advertiser extends User {
    private int adDuration;
    private double offeredMoney;
    private String product;

    public Advertiser(int userId, String userType, String username, String password, String email, int adDuration, double offeredMoney, String product) {
        super(userId, userType, username, password, email);
        this.adDuration = adDuration;
        this.offeredMoney = offeredMoney;
        this.product = product;
    }

    // Getters
    public int getAdDuration() { return adDuration; }
    public double getOfferedMoney() { return offeredMoney; }
    public String getProduct() { return product; }

    // Setters
    public void setAdDuration(int adDuration) { this.adDuration = adDuration; }
    public void setOfferedMoney(double offeredMoney) { this.offeredMoney = offeredMoney; }
    public void setProduct(String product) { this.product = product; }

    public void sendRequest() {
        System.out.println("Advertiser: Request sent.");
    }

    public void fillForm() {
        System.out.println("Advertiser: Form filled.");
    }

    public void contact() {
        System.out.println("Advertiser: Contact made.");
    }

    public void myRequests() {
        System.out.println("Advertiser: Viewing my requests.");
    }
}

