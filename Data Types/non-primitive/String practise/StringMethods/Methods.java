class Methods {
    public static void main(String[] args){

        //charAt() - returns the character at the specified index in a string.

        String myStr = "Hello";
        char result = myStr.charAt(4); //4 is specified index
        System.out.println(result); //output o  //IndexOutOfBoundsException - if index is negative or not less than the length of the specified string


        //codePointAt() - returns the Unicode value of the character at the specified index in a string.
        
        String myStr1 = "Hello";
        int result1 = myStr1.codePointAt(0);
        System.out.println(result1); // unicode of H is 72


        //codePointBefore() - returns the Unicode value of the character before the specified index in a string.
        String myStr2 = "Hello";
        int result2 = myStr2.codePointBefore(3);
        System.out.println(result2); // unicode of l is 108


        //codePointCount() - returns the number of Unicode values found in a string.

        String myStr3 = "Hello";
        int result3 = myStr3.codePointCount(1, 4);
        System.out.println(result3);


        //compareTo() - compares two strings lexicographically,comparison is based on the Unicode value of each character in the strings.

        String myString = "Hello";
        String myString1 = "Everyone";
        System.out.println(myString.compareTo(myString1)); // Returns 0 because they are equal



        //compareToIgnoreCase() - compares two strings lexicographically, ignoring lower case and upper case differences.
        
        String myString2 = "HELLO";
        String myString3 = "hello";
        System.out.println(myString2.compareToIgnoreCase(myString3));


        //concat() - appends (concatenate) a string to the end of another string.

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

    }
}
