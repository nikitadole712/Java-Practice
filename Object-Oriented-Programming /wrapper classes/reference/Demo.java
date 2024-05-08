//every primitive type we are going to have a class for it.
// int - Integer  this class basically extends the object class
//char - Character
//double - Double
public class Demo {
    public static void main(String args[]){
        int num = 7;
        Integer num1 = new Integer(8);  //num1 is reference
        System.out.println(num1);

        Integer num2 = new Integer(num); //we are storing primitive value in object this is called boxing
        System.out.println(num2);

        Integer num3 = num;     //this boxing is happening automatically.The primitive value automatically converted into object so it is called Auto Boxing.
        System.out.println(num3);

        Integer num4 = num3.intValue(); //unboxing.you are getting the value from object type to primitive type
        System.out.println(num4);

        int num5 = num3;    //we are getting the value from object type to primitive type automatically hence it is called auto-unboxing
        System.out.println(num5);
    }
}
