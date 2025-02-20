package creational.Factory;

public class InfoLogger implements Logger{
    @Override
    public void log() {
        System.out.println("inside infor logger");
    }
}
