class A
{
    int age;        //variable
    public void show()      //method
    {
        System.out.println("show in A");
    }
    class B     //class inside class called inner class
    {
        public void config()
        {
            System.out.println("config in B");
        }
    }
}
public class InnerClass {
    public static void main(String args[])
    {
        A obj = new A(); //$ symbol represents belongs to
        obj.show();

        A.B obj1 = obj.new B(); //if you want to create of object B yu need object of A because that (B) is not static method
        obj1.config();      //It only work for non-static class
    }
}
