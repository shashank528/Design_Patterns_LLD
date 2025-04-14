package Behavioural.Visitor.BankAccount;
interface IAccount
{
    void accept(Visitor visitor);
}
class FDAccount implements IAccount
{
    private int principal;
    public int getPrincipal()
    {
        return principal;
    }
    public FDAccount(int principal)
    {
        this.principal=principal;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class SavingsAccount implements IAccount
{
    private int principal;
    public int getPrincipal()
    {
        return principal;
    }
    public SavingsAccount(int principal)
    {
        this.principal=principal;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class CurrentAccount implements IAccount
{
    private int principal;
    public int getPrincipal()
    {
        return principal;
    }
    public CurrentAccount(int principal)
    {
        this.principal=principal;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class InterestCalculator implements Visitor
{

    @Override
    public void visit(SavingsAccount savingsAccount) {
        int interest = (savingsAccount.getPrincipal()*2*1)/100;
        System.out.println("interest ="+interest);
    }

    @Override
    public void visit(CurrentAccount currentAccount) {
        int interest = (currentAccount.getPrincipal()*5*1)/100;
        System.out.println("interest ="+interest);
    }

    @Override
    public void visit(FDAccount fdAccount) {
        int interest = (fdAccount.getPrincipal()*8*1)/100;
        System.out.println("interest ="+interest);
    }
}
interface Visitor
{
    void visit(SavingsAccount savingsAccount);
    void visit(CurrentAccount currentAccount);
    void visit(FDAccount fdAccount);

}
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(100);
        FDAccount fdAccount = new FDAccount(100);
        CurrentAccount currentAccount = new CurrentAccount(100);
        Visitor intrestcalculator = new InterestCalculator();
        savingsAccount.accept(intrestcalculator);
        fdAccount.accept(intrestcalculator);
        currentAccount.accept(intrestcalculator);
    }
}
