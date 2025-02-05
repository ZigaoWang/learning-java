public class Textbook extends Book {
    private int edition;

    public Textbook(String n, double p, int e) {
        super(n, p);
        edition = e;
    }

    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook other) {
        if (other == null) {
            return false;
        }
        return (getTitle() == other.getTitle() & getEdition() >= other.getEdition());
    }
}
