
abstract class Car
{
    public abstract void drive();
    public void playMusic()
    {
        System.out.println("Playinng Music....");
    }
}
class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Car obj = new WagonR();

        obj.drive();
        obj.playMusic();
        
    }
    
}
