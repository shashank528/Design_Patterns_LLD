package Behavioural.ChainofResponsibility;
abstract class AtmHandler
{
    int denomination;
    AtmHandler nextHandler;
    public AtmHandler(int denomination)
    {
        this.denomination=denomination;
    }
    public void setNextHandler(AtmHandler nextHandler)
    {
        this.nextHandler=nextHandler;
    }
    public void dispense(int amount)
    {
        if(amount>denomination)
        {
            int nofnote = amount/denomination;
            System.out.println("no of note of "+denomination+" dispensed ="+nofnote);
            int remainder = amount%denomination;
            if(remainder>0)
            {
                nextHandler.dispense(remainder);
            }
        }
    }
}
class ThousandHanlder extends AtmHandler
{
    public ThousandHanlder(int denomination) {
        super(denomination);
    }
}
class FiveHunderedHandler extends AtmHandler{

    public FiveHunderedHandler(int denomination) {
        super(denomination);
    }
}
class HundredHandler extends AtmHandler
{

    public HundredHandler(int denomination) {
        super(denomination);
    }
}
public class ATMDemo {
    public static void main(String[] args) {
        ThousandHanlder thousandHanlder = new ThousandHanlder(1000);
        FiveHunderedHandler fiveHunderedHandler = new FiveHunderedHandler(500);
        HundredHandler hundredHandler = new HundredHandler(100);
        thousandHanlder.setNextHandler(fiveHunderedHandler);
        fiveHunderedHandler.setNextHandler(hundredHandler);
        thousandHanlder.dispense(3700);

    }
}
