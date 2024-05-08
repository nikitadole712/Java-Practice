
public class AutoUnBoxing {
    public static void main(String args[])
    {
        int num = 7;

        Integer num1 = num;
        
        int num2 = num1;    //we are getting the value from object type to primitive type automatically hence it is called auto-unboxing
        System.out.println(num2);
    }
}
