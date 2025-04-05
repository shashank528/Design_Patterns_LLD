package Behavioural.Template.DeliveryTemplate;
abstract class Delivery
{
    public final void processDelivery()
    {
        authenticateUser();
        verifyPayment();
        initateDelivery();
    }

    public abstract void initateDelivery() ;

    public abstract void verifyPayment() ;

    public abstract void authenticateUser();
}
class InternationalDelievery extends Delivery
{

    @Override
    public void initateDelivery() {

    }

    @Override
    public void verifyPayment() {

    }

    @Override
    public void authenticateUser() {

    }
}
class DomsesticDelivery extends Delivery
{

    @Override
    public void initateDelivery() {

    }

    @Override
    public void verifyPayment() {

    }

    @Override
    public void authenticateUser() {

    }
}
public class DeliveryManager {
    public static void main(String[] args) {

    }
}
