public class Main {
    public static void main(String[] args) {
        Textbook bio2015 = new Textbook("Biology", 49.75, 2);
        Textbook bio2019 = new Textbook("Biology", 39.75, 3);
        System.out.println(bio2019.getEdition());
        System.out.println(bio2019.getBookInfo());
        System.out.println(bio2019.canSubstituteFor(bio2015));
        System.out.println(bio2015.canSubstituteFor(bio2019));
        Textbook math = new Textbook("Calculus", 45.25, 1);
        System.out.println(bio2015.canSubstituteFor(math));
    }
}