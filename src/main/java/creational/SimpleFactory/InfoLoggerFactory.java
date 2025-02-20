package creational.SimpleFactory;

//import Factory.InfoLogger;

public class InfoLoggerFactory implements IloggerFactory {
    @Override
    public Ilogger getLogger() {
        return new InfoLogger();
    }
}
