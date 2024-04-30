public class FindAChar {
    public static void main(String[] args){
        String txt = "Hello everyone, I am practicing my java knowledge and preparing for interview";
        //Java counts positions from zero.
        //0 is the first position in a string, 1 is the second, 2 is the third ...
        System.out.println(txt.indexOf("my")); // Outputs 32
    }
}
