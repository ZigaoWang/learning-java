public class Main {
    public static void main(String[] args) {
        Meal burger = new Meal("hamburger", 7.99);
        System.out.println(burger.toString());
        DeluxeMeal burritoCombo = new DeluxeMeal("burrito", "chips", "lemonade", 7.49);
        System.out.println(burritoCombo.toString());
    }
}