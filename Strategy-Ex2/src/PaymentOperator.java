public class PaymentOperator {
    private PaymentStrategy strategy;

    public PaymentOperator(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void payment(String methodOfPayment)
    {
        strategy.pay(methodOfPayment);
    }

}
