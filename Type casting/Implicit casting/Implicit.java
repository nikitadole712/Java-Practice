class Implicit{
    public static void main(String args[]) {
       int i = 20;
       int l = i;
       System.out.println(l);  

       long L = 10000;
       float f = L;         //float is larger than long because its depends on range not on bit.
       System.out.println(f);
    }
}