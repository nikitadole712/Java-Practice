
public class MultipleTryCatch {
    public static void main(String args[])
    {
        int i = 2;
        int j = 0;

        int num[] = new int[5];

        String str = null;

        try
        {
            j = 18/i;
            System.err.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divided by zero" );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limits");
        }
        catch(Exception e)  //Exception is parent class. it can handle all exception
        {       // there is a compulsion that parent class must be at the end. because we put it first then it will handle all exception 
            System.out.println("Something went wrong " +  e);   //then there is no need of other exception. it is good prractice to place it at end
        }

        System.out.println(j);
    }
}
