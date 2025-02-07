public class Main {
    public static void main(String[] args) {
        Review[] r = new Review[5];
        r[0] = new Review(4, "Good! Thx");
        r[1] = new Review(3, "OK site");
        r[2] = new Review(5, "Great!");
        r[3] = new Review(2, "Poor! Bad.");
        r[4] = new Review(3, "");

        ReviewAnalysis a = new ReviewAnalysis(r);
        a.getReview();

        System.out.println(a.getAverageRating());
        System.out.println(a.collectComments());
    }
}