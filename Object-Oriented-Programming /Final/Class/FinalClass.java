final class Calc        //using final keyword we can stop interitance means no other class extends the properties of this (final) class
{
    public void show()
    {
        System.out.println("in Calc show");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}
public class FinalClass {
    public static void main(String args[])
    {
        Calc obj = new Calc();
        obj.show();
        obj.add(4, 10);
    }
}
