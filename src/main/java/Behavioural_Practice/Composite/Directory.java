package Behavioural_Practice.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IComponent{
    private String name;
    List<IComponent> list;
    public Directory(String name)
    {
        this.name=name;
        this.list = new ArrayList<>();
    }
    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int size() {
        int size=0;
        for(IComponent component:list)
        {
            if(component.isLeaf())
            {
                size +=  component.size();
            }
            else
            {
                size += component.size();
            }
        }
        return size;
    }

    @Override
    public void ls() {
        System.out.println("directory name "+name);
        for(IComponent component:list)
        {
            component.ls();
        }
    }
    public void add(IComponent component)
    {
        this.list.add(component);
    }
}
