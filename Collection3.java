import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public static void main(String[] args) {
        
        Map<String ,Integer> students = new HashMap<>();

        students.put("Janisar" , 20);
        students.put("Akhtar",17);
        students.put("Fatma",18);

        System.out.println(students);

        System.out.println(students.get("Akhtar"));

    //    System.out.println(students.keySet());

        

        for(String key : students.keySet())
        {
            System.out.println(key + " : " +students.get(key));
        }
    }
}
