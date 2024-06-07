
class A
{
    public A()
    {
        System.out.println("Objected Created ");
    }

    public void show()
    {
        System.out.println("In A Show");
    }

}

public class demo4 {
    public static void main(String[] args) {
        new A();        // anonymous object
        new A().show();  // in java anonymous object is an object that is created without name ! 
    }
    
}
