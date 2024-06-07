class A 
{
    int age;

    public void show()
    {
        System.out.println("In show");
    }
    class B 
    {
        public void config()
        {
            System.out.println("In config ");
        }
    }
}

public class InClass {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();     // Accesing in class
        obj1.config();

    }
    
}
