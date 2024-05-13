enum Status     
{       //this is class
    Running, Failing, Pending, Success  //this is object of class
}
public class Enum 
{   //if you want to return status to the client, instead of returning a string format or specific object we can return status using enum
    public static void main(String args[])
    {
        int i = 5;
        Status [] ss = Status.values();

        for(Status s : ss)      //use to print all values of status
        {
            System.out.println(s + " : " +  s.ordinal());
        }

    }
}
