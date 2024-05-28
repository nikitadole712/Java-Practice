class A extends Thread  //Define a subclass of Thread:

{
    public void run() {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Hi");
        }
    }
}
class B extends Thread
{
    public void run() {
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Hello");
        }
    }
}
public class Demo {
    //The lifecycle of a thread includes several states: New, Runnable, Blocked, Waiting, Timed Waiting, and Terminated. Calling start moves the thread from the New state to the Runnable state, and the JVM eventually schedules it to run.
    public static void main(String args[]) 
    {
        //Create an instance or object of the subclass and start the thread:
        A obj = new A();
        B obj1 = new B();

        //start method is used to begin the execution of a new thread
        obj.start();    //If you call the run method directly instead of start, it will not create a new thread. Instead, it will execute in the current thread, behaving like a normal method call.
        obj1.start();  //When you call the start method on a Thread object, it causes the Java Virtual Machine (JVM) to create a new thread of execution. The run method of the thread is then called in that new thread of execution.
    }
}
