public class StrategyPatternExample {

    public static void main(String[] args)
    {
        // create editor with default strategy used!
        TextEditor editor = new TextEditor(new UppercaseFormatter());

        // Depending on the strategy chosen by the user, we can interchange it
        String text = "I have 10 apples";
        System.out.println(text);
        System.out.println(editor.formatText(text));

        editor.setFormatter(new LowercaseFormatter());
        System.out.println(editor.formatText(text));
    }
}
