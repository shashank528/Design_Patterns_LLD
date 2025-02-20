package creational.AbstractFactory;

public class TraditionalFurnitureFactory implements  FurniturFactory{
    @Override
    public IChair getChair() {
        return new TraditionalChair();
    }

    @Override
    public ITable getTable() {
        return new TraditionalTable();
    }

    @Override
    public ISofa getSofa() {
        return new TraditionSofa();
    }
}
