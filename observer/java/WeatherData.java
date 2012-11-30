public class WeatherData implements Subject {
    public float getTemperature() {
        return 14.2;
    }

    public float getHumidity() {
        return 55.0;
    }

    public float getPressure() {
        return 1.023;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        notifyObservers(temp, humidity, pressure);
    }

    public void registerObserver(Observer ob) {
        observers.put(ob);
    }

    public void removeObserver(Observer ob) {
        Observer.remove(ob);
    }

    public void notifyObservers(float temp, float humidity, float pressure) {

    }
}
