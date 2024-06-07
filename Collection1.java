import java.util.HashSet;
import java.util.Set;

public class Collection1 {
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet<Integer>();  
        nums.add(5);       // if we need sorted answer then 
        nums.add(7);       // we can use TreeSet
        nums.add(9);
        nums.add(2);
        nums.add(5);    // duplicate value will not print
        nums.add(7);
        nums.add(9);
        nums.add(2);

        System.out.println(nums);
    }
}
