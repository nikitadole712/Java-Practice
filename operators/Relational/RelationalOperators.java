class RelationalOperators{
    public static void main(String args[]){
        int x = 6;
        int y = 10;                 // > greater than
        boolean result = x > y;
        System.out.println(result);

        double a = 6.6;
        double b = 1.90;                 // > less than
        boolean result1 = a < b;
        System.out.println(result1);

        short p = 10;
        short q = 10;                 // > greater than equals to
        boolean result2 = p >= q;
        System.out.println(result2);

        long g = 10;
        long h = 10;                 // > less than equals to
        boolean result3 = g <= h;
        System.out.println(result3);

        int c = 10;
        int d = 100;                 // > not equals to
        boolean result4 = c != d;
        System.out.println(result4);

        int s = 10;
        int t = 10;                 // > greater than equals to
        boolean result5 = s == t;
        System.out.println(result5);
    }
}