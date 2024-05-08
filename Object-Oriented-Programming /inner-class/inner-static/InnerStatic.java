class A
{
    int age;        //variable
    public void show()      //method
    {
        System.out.println("show in A");
    }
    static class B     //class inside class called inner class.static can be only used in inner class
    {
        public void config()
        {
            System.out.println("config in B");
        }
    }
}
public class InnerStatic {
    public static void main(String args[])
    {
        A obj = new A(); //$ symbol represents belongs to
        obj.show();

        A.B obj1 = new A.B(); //when we refer static class we dont need object . we directly refer with A.B.
        obj1.config();      // this will only work when the class is static
    }
}
