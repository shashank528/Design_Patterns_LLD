package Behavioural.Template.PaymentDemo;
interface PaymentStrategy
{
    void execute();
}
class PayplaPaymentStrategy implements PaymentStrategy
{

    @Override
    public void execute() {
        System.out.println("execte payment from paypal");
    }
}
class UpiPaymentStrategy implements PaymentStrategy
{

    @Override
    public void execute() {
        System.out.println("execute payment from upi");
    }
}
abstract class OnlinePayment
{
    protected PaymentStrategy paymentStrategy;
    public final void processPayment()
    {
         authenticateUser();
         acceptpayment();
         processOrder();
    }

    public abstract void processOrder();

    public  void acceptpayment()
    {
        paymentStrategy.execute();
    }

    public abstract void authenticateUser() ;
}
class UpiPayment extends OnlinePayment{
    public UpiPayment(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }
    public void processOrder() {
        System.out.println("process order");
    }


    @Override
    public void authenticateUser() {
        System.out.println("verify user mobile number");
    }
}
class PaypalPayment extends OnlinePayment
{

    public PaypalPayment(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }
    @Override
    public void processOrder() {
        System.out.println("process order");
    }

    @Override
    public void authenticateUser() {
        System.out.println("verify paypal userid ");
    }
}
public class PaymentTemplateDemo {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy1 = new UpiPaymentStrategy();
        PaymentStrategy paymentStrategy2 = new PayplaPaymentStrategy();
        OnlinePayment payment = new UpiPayment(paymentStrategy1);
        payment.processPayment();
        OnlinePayment payment1 = new PaypalPayment(paymentStrategy1);
        payment1.processPayment();
    }
}
