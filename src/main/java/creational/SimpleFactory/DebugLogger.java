package creational.SimpleFactory;

public class DebugLogger implements Ilogger{
    @Override
    public void log() {
    System.out.println("debug logging");
    }
}
