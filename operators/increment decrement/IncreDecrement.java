class IncreDecrement{
    public static void main(String args[]){
        int num = 10;                           //post increment
        int result = num++;         //first fetch the value and then increment by one
        System.out.println(result);

        int num1 = 20;
        int result1 = ++num1;           //increment value by one and then fetch the value
        System.out.println(result1);               //pre increment

        int num2 = 30;
        int result2 = num2--;          //first fetch the value and then decrement by one
        System.out.println(result2);               //post decrement

        int num3 = 40;
        int result3 = --num3;           //decrement value by one and then fetch the value
        System.out.println(result3);               //pre increment
    }
}