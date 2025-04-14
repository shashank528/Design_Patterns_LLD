package Structural.Composite.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        IExpression number = new Number(5);
        IExpression number1 = new Number(4);
        IExpression number2 = new Number(3);
        ConcreteExpression concreteExpression = new ConcreteExpression(number1,number2,Operation.ADD);
        System.out.println(concreteExpression.evaluate());
        IExpression parent = new ConcreteExpression(number,concreteExpression,Operation.MULTIPLY);
        System.out.println(parent.evaluate());
    }
}
