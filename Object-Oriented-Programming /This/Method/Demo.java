class A          //every class of the java extends the properties of Object class even if you dont mention
{
    public A()          //Default constructor
    {     
        super();
        System.out.println("in A");
    }

    public A(int n)          
    {     
        super();
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()              
    {
        super(5);        //every constructor in java has a super() method
        System.out.println("in B");
    }

    public B(int n)
    {
        this();        //this() will execute the constructor of same class
        System.out.println("in B int");
    }
}
public class Demo {
    public static void main(String args[]) 
    {
        B obj = new B(4);
    }
}
