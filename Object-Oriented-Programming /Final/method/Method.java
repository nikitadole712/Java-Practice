class Calc       
{
    public final void show()  //to stp method overriding final keyword used with method
    {
        System.out.println("in Calc show");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc
{
    public void add()       //if you want to stp overriding of method add just add final keyword in add method of class Calc
    {
        System.out.println("in advance Calc");
    }
}

public class Method {
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4, 10);
    }
}
