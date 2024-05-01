public class Attributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Attributes myObj = new Attributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
  }
}
