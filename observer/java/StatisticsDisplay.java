import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperatures;
    private float maxTemperature;
    private float avgTemperature;
    private float minTemperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        temperatures = new ArrayList<Float>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemperature +
                "/" + maxTemperature + "/" + minTemperature);
    }

    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        int count = temperatures.size();

        if (count == 1) {
            this.maxTemperature = this.minTemperature =
                this.avgTemperature = temperature;
        } else {
            if (temperature > maxTemperature) {
                this.maxTemperature = temperature;
            } else if (temperature < minTemperature) {
                this.minTemperature = temperature;
            }
            float temperatureSum = 0;
            for (int i = 0; i < count; i++) {
                temperatureSum += (float)temperatures.get(i);
            }
            this.avgTemperature = temperatureSum / count;
        }

        display();
    }
}
