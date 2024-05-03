public class NestedFor {
    public static void main(String args[]){

        for(int i = 0; i <= 5; i++){
            System.out.println("Day" + i);
            for(int j = 0; j <= 7; j++){
                System.out.println(" " + (j+8) + "-" + " " + (j+9));
            }
        }
    }
}
