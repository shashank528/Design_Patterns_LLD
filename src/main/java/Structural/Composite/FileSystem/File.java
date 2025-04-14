package Structural.Composite.FileSystem;

public class File implements IComponent{
    private String fileName;
    public File(String fileName)
    {
        this.fileName=fileName;
    }
    @Override
    public void getSize() {

    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public void ls() {
        System.out.println("file name :"+fileName);
    }
}
