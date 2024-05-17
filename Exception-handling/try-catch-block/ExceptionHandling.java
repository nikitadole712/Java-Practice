
public class ExceptionHandling 
{
    public static void main(String args[])
    {
        int i = 0;  //if i is not 0 then it will print the answer of 18/i
        int j = 0;  
        try
        {
         j = 18/i;   // it gives  arithmatic exception because f devided by 0.
        }
        catch(Exception e)  //catch block will be executed nly in case of exception
        {   //if i is 0 then it will print the catch block. now this time it doesn't stop execution.thats why it print the value of j which is 0
            System.out.println("Something went wrong");
        }

        System.out.println(j);  //because of excepion happens, it stop execution

        System.out.println("Bye");
    }
}
