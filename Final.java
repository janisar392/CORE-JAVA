
// final -- variable , class , method

class A              // if we add final before class then you can not inheritant from A
{
    // public final void show()      // if we add final before void then function in b show error
    // {
    //     System.out.println(" By janisar");
    // }
    public void add(int a , int b)
    {
        System.out.println(a+b);
    }
}
class B extends A
{
    public void show()
    {
        System.out.println(" By Akhtar");   // To Stop this taking credit we add 
                                            //   final keyword on same function class A
    }
    
}

public class Final {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();
        obj.add(5,4);
        
    }
}
