public class ArrayLoop {
    public static void main(String[] args){         //using a "for" loop:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }

    for (String i : cars) {     //using a "for-each" loop:
        System.out.println(i);
      }    
    }
}
