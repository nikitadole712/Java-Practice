class Customer
{
    private int customer_id;
    private String name;

    //a constructor looks like method itself.it is a special method
    
    public Customer(int id, String n)       //passing parameters means parameterized constructor
    {
        customer_id = id;
        name = n;
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

public class Parameterized 
{
    public static void main(String args[])
    {
        Customer objCustomer = new Customer(20,"John");      //everytime when we create an object.the object will call the constructor.
        //we are passing parameters to call the parameterized constructor

        System.out.println(objCustomer.getCustomer_id() + ":" + objCustomer.getName());
    }
}
