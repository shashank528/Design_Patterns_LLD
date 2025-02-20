package creational.SimpleFactory;

public class DebugLoggerFactory implements IloggerFactory{
    @Override
    public Ilogger getLogger() {
        return new DebugLogger();
    }
}
