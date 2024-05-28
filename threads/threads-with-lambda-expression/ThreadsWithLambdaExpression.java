
public class ThreadsWithLambdaExpression {
    public static void main(String args[])
    {
        Runnable obj = () ->
        {
                for(int i = 1; i<=10; i++)
                {
                    System.out.println("Hi");
                    try {   //first we used Thread.sleep() but then we have error so we surrounded it as try-catch block
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }   //we are asking thr thread to wait
                }
        };
        Runnable obj1 = () ->
        {
                for(int i = 1; i<=10; i++)
                {
                    System.out.println("Hello");
                    try {   
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }   //we are asking thr thread to wait
                }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
