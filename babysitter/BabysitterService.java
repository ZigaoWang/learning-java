import java.util.ArrayList;

public class BabysitterService {
    private ArrayList<Babysitter> sitterList;
    public void addnewSitters(String[] names) {
        for (String name : names) {
            boolean exists = false;
            for (Babysitter sitter : sitterList) {
                if (sitter.getName().equals(name)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                sitterList.add(new Babysitter(name, 0));
            }
        }
    }

    public ArrayList<Babysitter> affordableSitters(double budget, int numChildren, int hours) {
        ArrayList<Babysitter> affordable = new ArrayList<>();
        for (Babysitter sitter: sitterList) {
            int years = sitter.getYears();
            int ratePerChildPerHour;
            if (years == 0) ratePerChildPerHour = 2;
            else if (years <= 4) ratePerChildPerHour = 2 + years;
            else ratePerChildPerHour = 6;
            double totalCharge = ratePerChildPerHour * numChildren * hours;
            if (totalCharge <= budget) {
                affordable.add(sitter);
            }
        }
        return affordable;
    }

    public boolean bookSitter(String sitterName) {
        for (Babysitter sitter : sitterList) {
            if (sitter.getName().equals(sitterName)) {
                sitter.incrementBookings();
                return true;
            }
        }
        return false;
    }

    public ArrayList<Babysitter> getHighDemandSitters(int threshold) {
        ArrayList<Babysitter> highDemand = new ArrayList<>();
        for (Babysitter sitter : sitterList) {
            if (sitter.getNumBookings() > threshold) highDemand.add(sitter);
        }
        return highDemand;
    }
}
