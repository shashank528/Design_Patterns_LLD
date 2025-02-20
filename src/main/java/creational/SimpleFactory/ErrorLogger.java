package creational.SimpleFactory;

public class ErrorLogger implements Ilogger{
    @Override
    public void log() {
        System.out.println("error logging");
    }
}
