package Structural.Composite.Calculator;

public class ConcreteExpression implements IExpression{
    private IExpression expressionA;
    private IExpression expressionB;
    private Operation operation;
    public ConcreteExpression(IExpression expressionA,IExpression expressionB,Operation operation)
    {
        this.expressionA=expressionA;
        this.expressionB=expressionB;
        this.operation=operation;
    }
    @Override
    public int evaluate() {
         int value=0;
        switch(operation)
        {
            case ADD -> {
                return expressionA.evaluate() + expressionB.evaluate();
            }
            case SUBTRACT -> {
                return expressionA.evaluate() - expressionB.evaluate();
            }
            case MULTIPLY -> {
                return expressionA.evaluate() * expressionB.evaluate();
            }
            case DIVIDE -> {
                if (expressionB.evaluate() == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return expressionA.evaluate()/expressionB.evaluate();
            }
        }
        return value;
    }
}
