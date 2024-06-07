//package Obj_Class;

class Mobile
{
    String brand;
    int price;
    static String name ;


    public Mobile()
    {
        brand ="";
        price = 200;
        System.out.println("In constructor");
    }

    static
    {
        name = "Phone";
        System.out.println("In static block");
    }

    public void show()
    {
        System.out.println(brand +" : "+ price+" : "+name);
    }
}

public class demo1 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
     //   Mobile.name = "SmartPhone";
        

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
     //   obj2.price = 1700;
     //   Mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();
    }
}
