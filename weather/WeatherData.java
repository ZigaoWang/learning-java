import java.util.ArrayList;

public class WeatherData {
    private ArrayList<Double> temperatures;

    public WeatherData() {
        temperatures = new ArrayList<>();
    }

    public void addData(Double a) {
        temperatures.add(a);
    }

    public ArrayList<Double> printData() {
        return temperatures;
    }

    public void cleanData(double lower, double upper) {
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > upper || temperatures.get(i) < lower) {
                temperatures.remove(i);
                i--;
            }
        }
    }

    public int longestHeatWave(double threshold) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > threshold) temp++;
            else temp = 0;
            count = Math.max(count, temp);
        }
        return count;
    }
}