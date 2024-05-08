
public class UnBoxing {
    public static void main(String args[])
    {
        int num = 7;
        Integer num1 = num;

        int num2 = num1.intValue(); //unboxing.you are getting the value from object type to primitive type using intValue().
        System.out.println(num2);
    }
}
