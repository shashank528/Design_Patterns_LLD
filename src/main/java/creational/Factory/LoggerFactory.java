package creational.Factory;

public class LoggerFactory {
    public static Logger getLogger(String type)
    {
        if(type.equalsIgnoreCase("info"))
        {
            return new InfoLogger();
        }
        else if(type.equalsIgnoreCase("error"))
        {
            return new ErrorLogger();
        }
        else if(type.equalsIgnoreCase("debug")) {
            return new DebugLogger();
        }
        else
            return null;

    }
}
