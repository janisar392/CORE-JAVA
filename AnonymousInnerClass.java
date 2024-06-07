class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        
        A obj = new A()
        {
            public void show()
            {
                System.out.println(" in A new Show : Anonymous Inner Class");
            }
        };
        obj.show();
    }
    
}
