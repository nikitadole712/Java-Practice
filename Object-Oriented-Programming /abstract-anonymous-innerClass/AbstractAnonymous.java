abstract class A
{
    public abstract void show();        //just to avoid the creating new class just for method overriding the anonymous inner class is used with abstract class and method
}
public class AbstractAnonymous {
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
