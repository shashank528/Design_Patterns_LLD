package Behavioural.Visitor.Generic;

interface Visitor
{
    public void visit(ConcreteElementA concreteElementA);
    public void visit(ConcreteElementB concreteElementB);
    public void visit(ConcreteElementC concreteElementC);
}
interface IElement
{
    void accept(Visitor visitor);
}
class ConcreteElementA implements IElement
{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class ConcreteElementB implements IElement
{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class ConcreteElementC implements IElement
{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class ConcreteVisitorA implements Visitor
{

    @Override
    public void visit(ConcreteElementA concreteElementA) {

    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {

    }

    @Override
    public void visit(ConcreteElementC concreteElementC) {

    }
}
class ConcreteVisitorB implements Visitor
{

    @Override
    public void visit(ConcreteElementA concreteElementA) {

    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {

    }

    @Override
    public void visit(ConcreteElementC concreteElementC) {

    }
}
public class GenericVisitorDemo {
    public static void main(String[] args) {

    }
}
