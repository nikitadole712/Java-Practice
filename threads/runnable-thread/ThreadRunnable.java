class A implements Runnable  //Define a class which is runnable:
//Runnable is an interface in Java that is intended to be implemented by any class whose instances are intended to be executed by a thread. The Runnable interface has only one method:
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
class B implements Runnable
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
public class ThreadRunnable {
    public static void main(String args[]) 
    {
        Runnable obj = new A();  //obj is runnable object
        Runnable obj1 = new B();    //create a referance of interface and object of class

        Thread t1 = new Thread(obj);    //runnable interface dont have the thread methods 
        Thread t2 = new Thread(obj1);   // we have to create thread object

        t1.start(); //start method belongs to thread
        
        t2.start();  
    }
}
