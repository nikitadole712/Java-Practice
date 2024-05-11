enum Status{
    Running, Failing, Pending, Success
}
public class Enum {
    public static void main(String args[])
    {
        int i = 5;
        Status [] ss = Status.values();

        for(Status s : ss)
        {
            System.out.println(s + " " +  s.ordinal());
        }

    }
}
