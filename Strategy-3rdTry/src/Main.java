//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor(new LowercaseFormatter());
        String text = "I have 10 apples and I want MORE";
        System.out.println(editor.formatText(text));
        editor.setFormatter(new UppercaseFormatter());
        System.out.println(editor.formatText(text));
    }
}