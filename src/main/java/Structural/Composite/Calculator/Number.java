package Structural.Composite.Calculator;

public class Number implements IExpression{
    private int value;
    public Number(int value)
    {
        this.value=value;
    }
    @Override
    public int evaluate() {
        return value;
    }
}
