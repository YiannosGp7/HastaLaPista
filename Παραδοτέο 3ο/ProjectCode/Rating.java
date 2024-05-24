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
     public void setRatingID(int ratingID) {
        this.ratingID = ratingID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }
}