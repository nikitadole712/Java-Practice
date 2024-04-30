class WhileLoop{
    public static void main(String args[])
    {
        int i = 1;          //used just like iterator

        while(i<=5)         //condition for limitatin to print "Hi" only for 5 times. 
                            //if we only mention true here then "Hi" will print indefinite times
        {
            System.out.println("Hii" + i);
            i++;            // i=1 then it will increse the value of i by 1
        }

            System.out.println("By" + i);       //it will print "Bye6" because the value of i reaches at 6.
                                                //condition i<=5 false here 
    }
}