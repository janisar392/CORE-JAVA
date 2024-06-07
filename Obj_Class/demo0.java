
package Obj_Class;
class student
{
    String  name;
    int   rollNO;
    int marks;
}

public class demo0{
    public static void main(String[] args) {
        
        student std1 = new student();
        std1.name = "Janisar";
        std1.rollNO= 118;
        std1.marks= 81;

        student std2 = new student();
        std2.name = "Akhtar";
        std2.rollNO= 118;
        std2.marks= 85;

        student std3 = new student();
        std3.name = "Fatma";
        std3.rollNO= 96;
        std3.marks= 88;

        student students[] = new student[3];
        students[0] = std1;
        students[1] = std2;
        students[2] = std3;


        for(student val : students){
            System.out.println(val.name + " : "+val.marks);
        }
    }
}