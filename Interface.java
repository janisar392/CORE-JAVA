
interface Computer       // abstract class Computer
{
     void code();    // public abstract void code();
    
}

class Laptop implements Computer     // class Laptop extends Computer
{
    public void code()
    {
        System.out.println("code , complile , run");

    }
}

class Desktop implements Computer      // class Desktop extends Computer
{
    public void code()
    {
        System.out.println("code , compile,run , Faster");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
         lap.code();
    }
}

public class Interface {
    public static void main(String[] args) { 

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        Developer AKhtar = new Developer();
        AKhtar.devApp(lap);
      //  AKhtar.devApp(desk);
        
    }
}
