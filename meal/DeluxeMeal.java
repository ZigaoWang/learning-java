public class DeluxeMeal extends Meal {
    private String sidedishName;
    private String drinkName;

    public DeluxeMeal(String n, String s, String d, double c) {
        super(n, c + 3);
        sidedishName = s;
        drinkName = d;
    }

    public String toString() {
        return "deluxe " + getName() + " meal, $" + getCost();
    }
}
