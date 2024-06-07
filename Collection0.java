import java.util.ArrayList;
import java.util.List;

public class Collection0 {
    public static void main(String[] args) {
        
         List<Integer> nums = new ArrayList<Integer>();

         nums.add(5);
         nums.add(7);
         nums.add(9);
         nums.add(2);

         System.out.println(nums.get(2));   // finding index value
         System.out.println(nums);     // printing full list
    }
}
