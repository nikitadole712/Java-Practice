//class - class --> extends 
//class - interface --> implements
//interface - interface --> extends
interface A
{
    int age = 28;    //the variables inside the interface are bydefault final and static
    String name = "john"; //we don't instatiate interface
    void show();    //its just like class where all the methods are public abstact
    void config();      //it tells the methods we need but interface is not implement them
}
interface X 
{
    void run();
}
interface Y extends X       //when we have interface to inheritance we use extends keyword
{

}
class B implements A,Y
{
    public void show()
    {
        System.out.println("show B");
    }
    public void config()
    {
        System.out.println("config B");     //interface dnt have the memory in heap
    }
    public void run()
    {
        System.out.println("run B");
    }
}


public class MoreOnInterface {
    public static void main(String args[])
    {
            A obj;      //we can not create object of intetface 
            obj = new B();  //but we can create object of class B
            obj.show();
            obj.config();

            X obj1;     //we have to create new reference of X because above object calls only A and A doent have run() method.
            obj1 = new B();
            obj1.run();

    }
}
