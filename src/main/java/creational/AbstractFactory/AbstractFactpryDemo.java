package creational.AbstractFactory;

public class AbstractFactpryDemo {
    public static void main(String[] args) {
        FurniturFactory modern = new ModernFurnitureFactory();
        FurniturFactory traditiona = new TraditionalFurnitureFactory();
        IChair chair1 = modern.getChair();
        ITable table1 = modern.getTable();
        ISofa sofa1 = modern.getSofa();
        IChair chair2 = traditiona.getChair();
        ITable table2 = traditiona.getTable();
        ISofa sofa2 = traditiona.getSofa();
        chair1.sitOn();
        chair2.sitOn();
        table2.eatOn();
        table1.eatOn();
        sofa1.lieOn();
        sofa2.lieOn();

    }
}
