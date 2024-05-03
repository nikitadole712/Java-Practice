class Calculator
{
    public int multi(int n1 , int n2 , int n3) //method add
    {
        return n1 * n2 * n3;
    }

    public double multi(double n1 , int n2)      //same name but different parameters
    {
        return n1 * n2;             //it is method overloading which method should be execute will be decided on compile time
    }
}


public class CompileTime        //behaviour is defined at compile time is called compile time polymorphism
{                               //also called early binding
    public static void main (String args[])
    {
        Calculator obj = new Calculator();
        int r1 = obj.multi(10,20,30);
        System.out.println(r1);
    }
}
