package creational.SimpleFactory;

public class SimpleFactory {
    public static void main(String[] args) {
        Ilogger ilogger = new InfoLoggerFactory().getLogger();
        ilogger.log();
    }
}
