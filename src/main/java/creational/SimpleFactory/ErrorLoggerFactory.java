package creational.SimpleFactory;

public class ErrorLoggerFactory implements  IloggerFactory{
    @Override
    public Ilogger getLogger() {
        return new ErrorLogger();
    }
}
