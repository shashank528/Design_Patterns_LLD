package Behavioural.Strategy;

interface PaymentStrategy
{
    void execute();
}
class CreditCard implements PaymentStrategy
{

    @Override
    public void execute() {
        System.out.println("paid through credit card");
    }
}
class Upi implements PaymentStrategy
{

    @Override
    public void execute() {
        System.out.println("paid through upi");
    }
}
class PaymentStrategyfactory
{
    static PaymentStrategy paymentStrategy;
    public static PaymentStrategy createPaymentStrategy(String strategy)
    {
        switch (strategy)
        {
            case "upi":
                paymentStrategy = new Upi();
                break;
            case "credit-card":
                paymentStrategy = new CreditCard();
                break;
            default:
                paymentStrategy= null;
        }
        return paymentStrategy;

    }
}
class PaymentProcessor
{
    public String strategy;
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(String strategy)
    {
        this.strategy=strategy;
        paymentStrategy = PaymentStrategyfactory.createPaymentStrategy(strategy);
    }
    public void processPayment()
    {
        paymentStrategy.execute();
    }

}
public class PaymentStrategyDemo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor("credit-card");
        paymentProcessor.processPayment();

    }
}
