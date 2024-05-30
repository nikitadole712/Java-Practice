class Counter
{
    int count;
    public synchronized void increment()    //synchronized keyword is used for only one method called at a time 
    {
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj = () ->
        {
            for(int i=1; i<=10000; i++)
            {
                c.increment();
            }
        };

        Runnable obj1 = () ->
        {
            for(int i=1; i<=10000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();      //join is special method which allows the main thread to wait for other threads cme back and join
        t2.join();

        System.out.println(c.count);
    }
}
