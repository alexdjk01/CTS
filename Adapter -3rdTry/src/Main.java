
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DataReader xmlReader = new XMLAdapter(new XMLDataReader());
        DataReader jsonReader = new JSONAdapter(new JSONDataReader());

        System.out.println(xmlReader.readData());
        System.out.println( jsonReader.readData());



    }
}