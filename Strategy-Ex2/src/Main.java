//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentOperator operator = new PaymentOperator(new CardPayment());
        operator.payment("Card");
        operator.setStrategy(new PayPalPayment());
        operator.payment("PayPal");
        operator.setStrategy(new CryptoPayment());
        operator.payment("Crypto");
    }
}