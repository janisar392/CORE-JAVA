//  class -- class --> extends
//  class -- interface --> implements
// interface -- interface --> extends

interface A 
{
    int age = 20;              // final and static
    String Area = "Noida";     // final and static

    void show();
    void config();
}

interface X 
{
    void run();
}

// interface Y extends X
// {

// }

class B implements A ,X
{
    public void show()
    {
        System.out.println("In show");
    }

    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("running...");
    }
}



public class Interface1 {
    public static void main(String[] args) {
        
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.Area);
    }
} 
