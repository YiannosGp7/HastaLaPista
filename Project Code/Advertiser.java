public class Advertiser extends User {
    private int adDuration;
    private double offeredMoney;
    private Product product;

    public Advertiser(int userID, String username, String password, String email, int adDuration, double offeredMoney, Product product) {
        super(userID, "Advertiser", username, password, email);
        this.adDuration = adDuration;
        this.offeredMoney = offeredMoney;
        this.product = product;
    }

    // Getters and Setters
    public int getAdDuration() {
        return adDuration;
    }

    public void setAdDuration(int adDuration) {
        this.adDuration = adDuration;
    }

    public double getOfferedMoney() {
        return offeredMoney;
    }

    public void setOfferedMoney(double offeredMoney) {
        this.offeredMoney = offeredMoney;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void sendRequest() {
        // logic to send request
    }
}
