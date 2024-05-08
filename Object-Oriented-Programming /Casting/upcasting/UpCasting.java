class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }

    
}
public class UpCasting {
    public static void main(String args[])
    {
        A obj = (A)new B();  //here we are going up. A is super class and B is subclass.we are trying to say that object is B but refer to A (super class).
        obj.show1();

    }
}
