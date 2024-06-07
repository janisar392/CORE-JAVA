import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection4 {
    public static void main(String[] args) {

        // sorting based on first digit of number

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i , Integer j)
            {
                if(i%10 > j%10)
                   return 1 ;
                else
                   return -1;
            }
        };
        

        List<Integer> nums = new ArrayList<>();

        nums.add(45);
        nums.add(18);
        nums.add(10);
        nums.add(12);
        nums.add(7);

        Collections.sort(nums);  // pass com to sorting on the basis of unit place number

        System.out.println(nums);
    }
}
