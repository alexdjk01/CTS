public class CardPayment implements  PaymentStrategy{
    @Override
    public void pay(String paymentMethod) {
        System.out.println("The payment was made using " +paymentMethod);
    }
}
