public class Review {
    private int rating;
    private String comment;

    public Review(int r, String c) {
        rating = r;
        comment = c;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public String toString() {
        return rating + comment;
    }
}
