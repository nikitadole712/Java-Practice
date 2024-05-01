public class DefineArray {
    public static void main(String[] args){
        //declared a variable that holds an array of strings.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};      //Access the Elements of an Array
        System.out.println(cars[0]);

        cars[0] = "Opel";           //Change an Array Element
        System.out.println(cars[0]);

        System.out.println(cars.length);        //Array Length

    }
}
