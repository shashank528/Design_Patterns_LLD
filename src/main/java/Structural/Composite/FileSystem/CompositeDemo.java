package Structural.Composite.FileSystem;

public class CompositeDemo {
    public static void main(String[] args) {
        IComponent component1 = new File("Border");
        Directory component2 = new Directory("Movie");
        Directory component3 = new Directory("Hindi_Movie");
        IComponent component4 = new File("pyar ka puchname");
        component2.add(component1);
        component2.add(component3);
        component3.add(component4);
        component2.ls();


    }
}
