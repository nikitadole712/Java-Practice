class A
{
    public int show(int x, int y)     //show() method name
    {
        return  x+y;
    }

    public int config(int x, int y)
    {
        return x - y;
    }
}
class B extends A                       //it is method overriding which method should be execute will be decided on run time
{
    public int show(int x, int y)     //same methd name same parameters  
                                    //here class B override the show method of class A 
    {
        return  x+y+1;
    }
}
public class RunTime     //overriding means same name same parameters but different behaviour
{                        //behaviour is defined at compile time is called compile time polymorphism. it is also called late binding polymorphism
    public static void main(String args[]) 
    {
        B obj = new B();
        int r1 = obj.show(7,9);
        int r2 = obj.config(12,6);
        System.out.println(r1 + " " +r2);  //output is 17 6
    }
}
