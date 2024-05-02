class A
{
    public int show(int x, int y)
    {
        return  x+y;
    }

    public int config(int x, int y)
    {
        return x - y;
    }
}
class B extends A
{
    public int show(int x, int y)       //here class B override the show method of class A 
    {
        return  x+y+1;
    }
}
public class Overriding     //overriding means same name same parameters but different behaviour
{
    public static void main(String args[]) 
    {
        B obj = new B();
        int r1 = obj.show(7,9);
        int r2 = obj.config(12,6);
        System.out.println(r1 + " " +r2);  //output is 17 6
    }
}
