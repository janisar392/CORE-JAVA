
class cal
{
    public int sum(int a ,int b){
        return a+b;
    }
}

class AdCal extends cal
{
    public int sum(int a , int b){    //Overriding
        return a+b+1;
    }
}

public class Overriding {
    public static void main(String[] args) {
        
        AdCal obj = new AdCal();

        int r = obj.sum(5,6);

        System.out.println(r);

      
    }
}
