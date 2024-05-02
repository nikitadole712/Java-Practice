class A          //every class of the java extends the properties of Object class even if you dont mention
{
    public A()          //Default constructor
    {     
        super();
        System.out.println("in A");
    }

    public A(int n)          //Parameterized constructor
    {     
        super();
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()              //Default constructor
    {
        super(5);        //every constructor in java has a super() method
        System.out.println("in B");
    }

    public B(int n)
    {
        super(n);        //super() means call the constructor of super class. if we want to call parameterized constructor we have to pass parameters in super method
        System.out.println("in B int");
    }
}
public class Dem {
    public static void main(String args[]) 
    {
        B obj = new B(5);
    }
}
