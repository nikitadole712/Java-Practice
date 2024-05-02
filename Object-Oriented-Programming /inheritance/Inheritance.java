
public class Inheritance {
    public static void main(String args[]) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,6);
        int r2 = obj.sub(14,6);
        int r3 = obj.mult(4,6);
        int r4 = obj.div(4,2);
        double r5 = obj.power(12,6);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
