enum Status{
    Running, Failing, Pending, Success
}
public class EnumSwitch {
    public static void main(String args[])
    {
        Status s = Status.Pending;

        switch(s)
        {
            case Running:
            System.out.println("All Good");
            break;

            case Failing:
            System.out.println("Try Again");
            break;

            case Pending:
            System.out.println("Please Wait");
            break;
            
            case Success:
            System.out.println("Success");
            break;
        }
    }
}
