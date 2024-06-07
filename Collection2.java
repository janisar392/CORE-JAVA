import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


public class Collection2 {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.add(2);

         Iterator<Integer> values =  nums.iterator();

         while(values.hasNext())
             System.out.println(values.next());

        
    }
    
}
