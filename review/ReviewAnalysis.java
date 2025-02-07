import java.util.ArrayList;
import java.util.Objects;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[] a) {
        allReviews = a;
    }

    public void getReview() {
        for (int i = 0; i < allReviews.length; i++) {
            System.out.println(allReviews[i]);
        }
    }

    public double getAverageRating() {
        int sum = 0;
        for (Review allReview : allReviews) {
            sum += allReview.getRating();
        }
        return (double) sum / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> c = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i++) {
            String temp = allReviews[i].getComment();
            boolean hasExclamation = false;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '!') hasExclamation = true;
            }
            boolean hasPeriod = false;
            if (temp.length() != 0 && temp.charAt(temp.length() - 1) != '.' && temp.charAt(temp.length() - 1) != '!') temp += '.';
            if (hasExclamation) c.add(i + "-" + temp);
        }
        return c;
    }
}
