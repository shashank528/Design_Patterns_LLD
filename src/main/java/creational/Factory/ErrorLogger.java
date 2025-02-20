package creational.Factory;

public class ErrorLogger implements Logger{
    @Override
    public void log() {
        System.out.println("inside error logger");
    }
}
