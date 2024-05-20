//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        station.registerObserver(display1);
        station.registerObserver(display2);
        station.removeObserver(display2);

        station.changeInformations(80,80,100);
    }
}