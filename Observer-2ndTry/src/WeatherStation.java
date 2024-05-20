import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observerList;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherStation()
    {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList)
        {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void changeInformations(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
