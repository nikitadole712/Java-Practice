class Calculator
{
    public int add(int n1 , int n2 , int n3) //method add
    {
        return n1 + n2 + n3;
    }

    public int add(int n1 , int n2)     //same name but different parameters
    {
        return n1 + n2 ;
    }

    public double add(double n1 , int n2 , int n3)      //same name but different parameters
    {
        return n1 + n2 + n3;
    }
}


public class Overloading        //method overloading is same name but different parameters
{
    public static void main (String args[])
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(10,20,30);
        System.out.println(r1);
    }
}
