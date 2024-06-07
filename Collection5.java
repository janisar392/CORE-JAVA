import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;
    int marks;

    

   
    public Student(int age, String name,int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }




    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", marks= "+marks+" ]";
    }

    
}

public class Collection5 {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i , Student j)
            {
                if(i.marks > j.marks)    // compare on the basis of marks
                   return 1 ;
                else
                   return -1;
            }
        };

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(20,"Janisar",92));
        studs.add(new Student(19,"Akhtar",89));
        studs.add(new Student(17,"Fatma",96));

        Collections.sort(studs,com);

        for(Student s : studs)
            System.out.println(s);
        
        
    }
}
