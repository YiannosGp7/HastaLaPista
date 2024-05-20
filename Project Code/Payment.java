public class Payment {
    private int paymentID;
    private Renter renter;
    private double amount;
    private String paymentMethod;

    public Payment(int paymentID, Renter renter, double amount, String paymentMethod) {
        this.paymentID = paymentID;
        this.renter = renter;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    // Getters and Setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void confirmPayment() {
        System.out.println("Payment confirmed for: " + this.renter.getUsername());
    }
}
