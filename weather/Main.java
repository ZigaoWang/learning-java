public class Main {
    public static void main(String[] args) {
        WeatherData a = new WeatherData();
        a.addData(99.1);
        a.addData(142.0);
        a.addData(85.0);
        a.addData(85.1);
        a.addData(84.6);
        a.addData(94.3);
        a.addData(124.9);
        a.addData(98.0);
        a.addData(101.0);
        a.addData(102.5);
        System.out.println(a.longestHeatWave(90.0));
        a.cleanData(85.0, 120.0);
        System.out.println(a.printData());
    }
}