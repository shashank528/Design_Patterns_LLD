package creational.Factory;

public class DebugLogger implements Logger{
    @Override
    public void log() {
        System.out.println("inside debugger");
    }
}
