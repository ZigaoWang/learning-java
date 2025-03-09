public class Babysitter {
    private String name;
    private int yearsExp;
    private int numBookings;

    public Babysitter(String n, int exp) {
        name = n;
        yearsExp = exp;
    }
    public String getName() {
        return name;
    }
    public int getYears() {
        return yearsExp;
    }
    public int getNumBookings() {
        return numBookings;
    }
    public void incrementBookings() {
        numBookings++;
    }
}
