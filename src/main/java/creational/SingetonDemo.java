package creational;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Singelton
{
    public static Singelton instance =null;
    private Singelton()
    {

    }
    public static Singelton getInstance()
    {
        if(instance==null)
        {
           Lock lock=new ReentrantLock();
           if(instance==null)
           {
               lock.lock();
               try
               {
                   if(instance==null)
                   {
                       instance=new Singelton();
                   }
               }catch(Exception e)
               {

               }
               finally
               {
                   lock.unlock();
               }
           }

        }
        return instance;
    }
}
public class SingetonDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                Singelton instance = Singelton.getInstance();
                System.out.println("Instance hashcode: " + instance.hashCode());
            });
            thread.start();
        }


    }
}
