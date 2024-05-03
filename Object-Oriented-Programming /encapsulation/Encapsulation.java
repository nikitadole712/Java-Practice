class Employee 
{
    private int age; // every time yu create a instance variable make it private
    private String name;

    public int getAge() // we can access the private variables with the help of methods
    { // this means we are binding our data with medhods
        return age;
    }

    public void setAge(int a) 
    {
        age = a;
    }

    public String getName() // when we want to get the value we use getter method
    {
        return name;
    }

    public void setName(String n) // when we want to set the value we use setter method
    {
        name = n;
    }
}

public class Encapsulation // binding data and methods in single unit.not accessible by outside
{
    public static void main(String args[]) 
    {
        Employee objEmployee = new Employee();
        objEmployee.setAge(25);
        objEmployee.setName("John");

        System.out.println(objEmployee.getAge() + ":" + objEmployee.getName());
    }
}
