public class Rating {
    private int ratingID;
    private int score;
    private String comment;
    private Renter renter;

    public Rating(int ratingID, int score, String comment, Renter renter) {
        this.ratingID = ratingID;
        this.score = score;
        this.comment = comment;
        this.renter = renter;
    }

    // Getters and Setters
    public int getRatingID() {
        return ratingID;
    }