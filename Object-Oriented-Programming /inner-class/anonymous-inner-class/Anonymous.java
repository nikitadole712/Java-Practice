class A
{
    public void show(){     //if we have the purpose to change the value of show method or override the method show() we create new child class which aquire the prperties of superclass 
        System.out.println("in A show");
    }
}
public class Anonymous {
    public static void main(String args[])
    {
        A obj = new A()
        {           //then instead of creating new child class which extends the properties of superclass.we can create an anonymous class. which has no name
            public void show(){     //we are providing new implementation here.this is called a inner class.as we are not using class keyword and also we are not giving to name to it
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
