class A extends Thread  //Define a subclass of Thread:

{
    public void run() {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Hi");
            try {   //first we used Thread.sleep() but then we have error so we surrounded it as try-catch block
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   //we are asking thr thread to wait
        }
    }
}
class B extends Thread
{
    public void run() {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadSleep {
    public static void main(String args[]) 
    {
        A obj = new A();
        B obj1 = new B();

        obj.setPriority(Thread.MAX_PRIORITY);   //it set the priority of obj2
        obj.start(); 
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        obj1.start();  
    }
}
