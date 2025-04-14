package Structural.Composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IComponent{
    private String directoryName;
    List<IComponent> list;
    public Directory(String directoryName)
    {
        this.directoryName=directoryName;
        this.list= new ArrayList<>();
    }
    public void add(IComponent component)
    {
        list.add(component);
    }
    @Override
    public void getSize() {

    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public void ls() {
        System.out.println("directory name :"+directoryName);
        for(IComponent component:list)
        {
            component.ls();
        }
    }
}
