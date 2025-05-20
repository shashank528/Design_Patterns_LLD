package Behavioural_Practice.Composite;

public class FileSystemDemo {
    public static void main(String[] args) {
        IComponent file1 = new File(5,"file1",true);
        IComponent file2 = new File(3,"file2",true);
        IComponent file3 = new File(5,"file3",true);
        IComponent file4 = new File(2,"file4",true);
        Directory directory1 = new Directory("directory1");
        Directory directory2 = new Directory("directory2");
        directory1.add(directory2);
        directory2.add(file3);
        directory2.add(file4);
        System.out.println("directory2 size "+directory2.size());
        System.out.println("directory1 size "+directory1.size());
        directory2.ls();
        directory1.ls();
        directory1.add(file1);
        directory1.add(file2);
        System.out.println("directory2 size "+directory2.size());
        System.out.println("directory1 size "+directory1.size());
        directory2.ls();
        directory1.ls();
    }
}
