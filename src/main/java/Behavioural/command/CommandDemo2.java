package Behavioural.command;
interface ICommand{
    public void execute();
}
//command concrete
class ToggleCommand implements ICommand
{
    Light light;
    public ToggleCommand(Light light)
    {
        this.light=light;
    }
    @Override
    public void execute() {
        light.toggle();
    }
}
//receiver
class Light
{
    public boolean isOn = false;
    public void toggle()
    {
        if(!isOn)
        {
            System.out.println("turnOn light");
        }
        else
        {
            System.out.println("turnOff light");
        }
        isOn=!isOn;
    }
}
class Invoke
{
    public void processrequet(ICommand command)
    {
        command.execute();
    }
}
public class CommandDemo2 {
    public static void main(String[] args) {
        Invoke invoker = new Invoke();
        Light light=new Light();
        ICommand command = new ToggleCommand(light);
        invoker.processrequet(command);
        invoker.processrequet(command);
        invoker.processrequet(command);
    }
}
