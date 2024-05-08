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
public class DownCasting {
    public static void main(String args[])
    {
        A obj = new B();
        obj.show1();

        B obj1 = (B) obj; //here we are refering new object to existing object. that means we are refering the subclass B.so we are going down
        obj1.show2();
    }
}
