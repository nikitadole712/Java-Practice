class A
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B extends A           //it is possible when we have inheritance
{
    public void show()
    {
        System.out.println("in B");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("in C");
    }
}
public class Demo {
    public static void main(String args[])
    {
        A obj = new A();        //created reference of superclass and object of subclass
        obj.show();

        obj = new B();          //also called dynamic method dispatch
        obj.show();

        obj = new C();      //which method will call decides at runtime. so it is example of runtime polymorphism 
        obj.show();
    }
}
