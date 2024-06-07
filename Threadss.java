class A extends Thread
{
    public void run()
    {
        for(int i = 0 ; i<100 ; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace();   }
        }
    }

}

class B extends Thread
{
    public void run()
    {
        for(int i = 0 ; i< 100 ;i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace();   }
        }
    }
}

public class Threadss {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 =new B();

        obj.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) { e.printStackTrace();   }

        obj1.start();
    }
    
}
