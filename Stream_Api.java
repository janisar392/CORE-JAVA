import java.util.Arrays;
import java.util.List;

public class Stream_Api {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,7,5,8,9,1,2,6);

        // int sum = 0;
        // for(int n : nums)
        // {
        //     if(n%2==0)
        //     {
        //         n = n*2;
        //         sum += n;
        //     }
        // }

        // System.out.println(sum);

        nums.forEach(n -> System.out.println(n));
    }
}