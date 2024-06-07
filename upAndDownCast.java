class A
{
    public void show1()
    {
        System.out.println("In Show 1 ");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In show 2 ");
    }
}

public class upAndDownCast {
    public static void main(String[] args) {
        
        A obj =(A) new B();  // A obj = new B();  --> Up Casting
        obj.show1();


        B obj1 = (B) new B();  // B obj1 = (B) obj ;  -- > Down Casting
        obj1.show2();     
    }
    
}
