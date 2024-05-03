class Customer
{
    private int customer_id;
    private String name;

    //a constructor looks like method itself.it is a special method
    public Customer()       //constructor name should be same as the class name
    {
        customer_id =  1;
        name = "john";      //it never return anything
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}

public class Constructor 
{
    public static void main(String args[])
    {
        Customer objCustomer = new Customer();      //everytime when we create an object.the object will call the constructor.

        System.out.println(objCustomer.getCustomer_id() + ":" + objCustomer.getName());
    }
}
