package Polymorphism;

class A
{
    public void show()
    {
        System.out.println("IN A show");
    }

}
class B extends A
{
    public void show()
    {
        System.out.println("IN B show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("IN C show");
    }
}
public class runtime {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();                //dynamic method dispatched
                                   // many behaiour
        obj = new B();       
        obj.show();

        obj = new C();
        obj.show();
    }
}
