package Behavioural;
interface Icommmand
{
    void execute();
}
class RequestRideCommand implements  Icommmand{
    private String passenger;
    private String src;
    private String dest;
    private RideService rideService;
    public RequestRideCommand(String passenger,String src,String dest,RideService rideService)
    {
        this.passenger=passenger;
        this.src=src;
        this.dest=dest;
        this.rideService=rideService;
    }
    @Override
    public void execute() {
        rideService.requestRide(passenger,src,dest);
    }
}
class CancelRideCommand implements  Icommmand
{
    private String passenger;
    //receiver
    private RideService rideService;
    public CancelRideCommand(String passenger,RideService rideService)
    {
        this.passenger=passenger;
        this.rideService=rideService;
    }
    @Override
    public void execute() {
        rideService.cancelRide(passenger);
    }
}
//receiver
class RideService
{

    public void requestRide(String passenger,String src,String dest)
    {
        System.out.println("requesting ride for "+passenger+" from "+src+" to "+dest);
    }
    public void cancelRide(String passenger)
    {
        System.out.println("cancelling ride for "+passenger);
    }
}
//invoker
class Invoker
{
    public void processRequest(Icommmand icommmand)
    {
        icommmand.execute();
    }
}
public class CommandDemo {
    public static void main(String[] args) {
        RideService rideService = new RideService();
        Icommmand icommmand1 = new RequestRideCommand("shashank","bon vivant","khardi",rideService);
        Icommmand icommmand2 = new CancelRideCommand("ragini ",rideService);
        Invoker  invoker = new Invoker();
        invoker.processRequest(icommmand1);
        invoker.processRequest(icommmand2);
    }

}
