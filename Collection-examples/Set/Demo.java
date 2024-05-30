import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(9);
        nums.add(19);
        nums.add(91);
        nums.add(7);
        nums.add(5);

        
        for(Object n : nums)
        {
            System.out.println(n);
        }
    }
}
