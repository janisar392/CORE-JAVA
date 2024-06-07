class A
{
    public A()
    {
        super();
        System.out.println("in A ");
    }
    public A(int n)
    {
        super();
        System.out.println("IN A int");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B ");
    }
    public B(int n)
    {
        this();
        System.out.println("in B int");
    }
}

public class demo3 {
    public static void main(String[] args) 
    {
       B obj = new B(1);
    }
}
