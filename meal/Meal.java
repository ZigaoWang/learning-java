public class Meal {
    private String name;
    private double cost;

    public Meal(String n, double c) {
        name = n;
        cost = c;
    }

    public String toString() {
        return name + " meal, $" + cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
