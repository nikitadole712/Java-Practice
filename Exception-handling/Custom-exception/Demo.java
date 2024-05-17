//if you want to throw the exception instead of the java exceptions
class DeveloperException extends Exception
{
    public DeveloperException(String string){
        super(string);
    }
}
public class Demo {
    public static void main(String args[])
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
            {
                throw new DeveloperException("I dont want to print zero");
            }
        }
        catch(DeveloperException e)
        {
            j = 18/1;
            System.out.println("Thats the default output " + e);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
    }
}
