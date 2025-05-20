package Structural.Bridge.Generic;



interface Abstraction
{
    public void use();
}
interface Implementor
{
    public void implement();
}
class RefinedAbtsraction implements Abstraction
{
    Implementor implementor;
    public RefinedAbtsraction(Implementor implementor)
    {
        this.implementor = implementor;
    }
    @Override
    public void use() {
        implementor.implement();
    }
}
class ConcreteImplementor implements Implementor
{

    @Override
    public void implement() {
        System.out.println("using concreteimplementor");
    }
}
public class GenericBridgeDemo {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbtsraction(implementor);
        abstraction.use();
    }
}
