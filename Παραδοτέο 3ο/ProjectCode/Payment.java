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
