package creational.Factory;

public class Factory {
    public static void main(String[] args) {
        System.out.println("factory demo");
       LoggerFactory.getLogger("info").log();
        LoggerFactory.getLogger("error").log();
        LoggerFactory.getLogger("debug").log();
    }

}
