package Behavioural_Practice.Composite;

public class File implements IComponent{
    private int size;
    private String name;
    private boolean isleaf;
    public File(int size,String name,boolean isleaf)
    {
        this.size=size;
        this.name=name;
        this.isleaf=isleaf;
    }
    @Override
    public boolean isLeaf() {
        return isleaf;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void ls() {
        System.out.println("file name "+name);
    }
}
