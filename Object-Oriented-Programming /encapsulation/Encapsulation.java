class Employee
{
    private int age;
    private String name;
}
public class Encapsulation  //binding data and methods in single unit.not accessible by outside 
{
    public static void main(String args[])
    {
        Employee objEmployee = new Employee();
        objEmployee.age = 25;
        objEmployee.name = "John";

        System.out.println(objEmployee.name);
    }
}
