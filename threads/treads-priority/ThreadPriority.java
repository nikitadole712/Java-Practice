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
public class ThreadPriority {
    public static void main(String args[]) 
    {
        A obj = new A();
        B obj1 = new B();

        obj.setPriority(Thread.MAX_PRIORITY);   //it set the priority of obj2
        System.out.println(obj.getPriority());  //it is used to get the current priority. priority range from 0-10.min priority is 0 , max priority is 10 and 5 is normal priority
        obj.start();    
        obj1.start();  
    }
}
