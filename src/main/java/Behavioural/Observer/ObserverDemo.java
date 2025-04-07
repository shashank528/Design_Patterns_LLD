package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;
enum NotifiactionType
{
    EMAIL,SMS,BOTH;
}
interface Observer {
    public void update(String state);
    NotifiactionType getNotificationType();
}
class ConcreteObserverA implements Observer{
    NotifiactionType type;
    public ConcreteObserverA(NotifiactionType type)
    {
        this.type=type;
    }
    @Override
    public void update(String state) {
        NotifiactionType type = getNotificationType();
        switch (type)
        {
            case EMAIL:
                System.out.println("notified observer A through enail");
                break;
            case SMS:
                System.out.println("notified observer A thoough sms");
                break;
            case BOTH:
                System.out.println("notified observer A thoough sms");
                System.out.println("notified observer A through enail");
                break;
        }

    }

    @Override
    public NotifiactionType getNotificationType() {
        return type;
    }
}
class ConcreteObserverB implements Observer{
        NotifiactionType type;
        public ConcreteObserverB(NotifiactionType type)
        {
            this.type=type;
        }
    @Override
    public void update(String state) {
        NotifiactionType type = getNotificationType();
        switch (type)
        {
            case EMAIL:
                System.out.println("notified observer B through enail");
                break;
            case SMS:
                System.out.println("notified observer B thoough sms");
                break;
            case BOTH:
                System.out.println("notified observer B thoough sms");
                System.out.println("notified observer B through enail");
                break;
        }

    }
    @Override
    public NotifiactionType getNotificationType() {
        return type;
    }
}
class Subject
{
    List<Observer> observers = new ArrayList<>();
    private String state;
    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }
    public void remove(Observer observer)
    {
        observers.remove(observer);
    }
    public void setState(String state)
    {
        this.state=state;
        notifyObserver( state);
    }
    public void notifyObserver(String state)
    {
        for(Observer obs:observers)
        {
            obs.update(state);
        }
    }
}
public class ObserverDemo {
    public static void main(String[] args) {
    Subject s=new Subject();
    s.addObserver(new ConcreteObserverA(NotifiactionType.SMS));
    s.addObserver(new ConcreteObserverB(NotifiactionType.BOTH));
    s.setState("started");
    s.setState("running");
    }
}
