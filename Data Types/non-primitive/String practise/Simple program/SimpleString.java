class SimpleString {
    public static void main(String[] args) {

       String name = new String("Hello");  //string is immutable
       System.out.println(name);            //synchonized

       String greeting = "Good Morning!!!";    //less efficient
       System.out.println(greeting);
       
   } 
}
