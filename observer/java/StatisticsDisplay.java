import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private ArrayList<Float> temperatures;
    private float maxTemperature;
    private float avgTemperature;
    private float minTemperature;

    public StatisticsDisplay(Observable observable) {
        temperatures = new ArrayList<Float>();
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemperature +
                "/" + maxTemperature + "/" + minTemperature);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            float temperature = weatherData.getTemperature();
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
}
