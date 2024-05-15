//functional interface is an interface which has nly on method

@FunctionalInterface
interface A     //this interface called SAM(Single Abstract Method Interface)
{
    void show();
}


public class Demo {
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("show in A");
            }
        };
        obj.show();
    }
}
