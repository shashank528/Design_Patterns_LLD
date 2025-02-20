package creational.AbstractFactory;

public class ModernFurnitureFactory implements FurniturFactory{
    @Override
    public IChair getChair() {
        return new ModernChair();
    }

    @Override
    public ITable getTable() {
        return new ModernTable();
    }

    @Override
    public ISofa getSofa() {
        return new ModernSofa();
    }
}
