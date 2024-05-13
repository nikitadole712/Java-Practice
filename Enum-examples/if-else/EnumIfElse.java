enum Status
{
    Running, Failing, Pending, Success
}
public class EnumIfElse {
    public static void main(String args[])
    {
        Status s = Status.Pending;

        if(s == Status.Running)
        {
            System.out.println("All Good");
        }
        else if(s == Status.Failing)
        {
            System.out.println("Try again");
        }
        else if(s == Status.Pending)
        {
            System.out.println("Please wait");
        }
        else{
            System.out.println("Success");
        }
    }
}
