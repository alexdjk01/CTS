//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DataAdapter xmlAdapter = new XMLAdapter(new XMLDataReader());
        DataAdapter jsonAdapter = new JSONAdapter(new JSONDataReader());

        System.out.println(xmlAdapter.readData());
        System.out.println(jsonAdapter.readData());
    }
}