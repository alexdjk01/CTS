//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WeatherSubject weatherSubject = new WeatherSubject();
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        weatherSubject.registerObserver(display1);
        weatherSubject.registerObserver(display2);

        //Simulate weather updates
        weatherSubject.setMeasurements(75,60,30.4f);
        weatherSubject.setMeasurements(80,40,38.4f);

    }
}