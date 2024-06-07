package Inheritnce;
public class demo {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();

       double r5 = obj.power(4,2 );
       int r4 = obj.div(52,4);
       int r3 = obj.mul(4,3);
       int r2 = obj.sub(8,3);
       int r1 = obj.add(8,7);

       System.out.println("Add :"+r1);
       System.out.println("Sub :"+r2);
       System.out.println("Mul :"+r3);
       System.out.println("Div :"+r4);
       System.out.println("Power :"+r5);
    }
}

// NOTE : java does not support multiple inheritence .
