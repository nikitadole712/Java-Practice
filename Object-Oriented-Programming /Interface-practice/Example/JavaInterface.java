interface A
{
    int age = 28;    //the variables inside the interface are bydefault final and static
    String name = "john"; //we don't instatiate interface
    void show();    //its just like class where all the methods are public abstact
    void config();      //it tells the methods we need but interface is not implement them
}
class B implements A
{
    public void show()
    {
        System.out.println("show B");
    }
    public void config()
    {
        System.out.println("config B");     //interface dnt have the memory in heap
    }
}


public class JavaInterface {
    public static void main(String args[])
    {
            A obj;      //we can not create object of intetface 
            obj = new B();  //but we can create object of class B
            obj.show();
            obj.config();

            System.out.println(A.name);     //if we want to print the value of variables declare in interface we can directly use hat. no need of object here.
    }
}
