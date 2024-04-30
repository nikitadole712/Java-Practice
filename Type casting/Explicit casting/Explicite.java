public class Explicite {
    public static void main(String args[]) {
        
        long L = 123456789;
        byte B = (byte) L; // for explicite we have to add datatype of lower range in bracket
        System.out.println(B);  //Data loss
    }
}
