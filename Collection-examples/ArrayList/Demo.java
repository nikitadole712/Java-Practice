import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(9);
        nums.add(19);
        nums.add(91);
        nums.add(7);
        nums.add(5);

        System.out.println(nums.indexOf(2));

        System.out.println(nums.get(2));

        //for(Object n : nums)
        //{
        //    int num = (Integer)n;
        //    System.out.println(num*2);
        //}
    }
}
