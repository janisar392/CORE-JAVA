
class calculator{

    public int add(int a ,int b){
        int r = a+b;
        return r;
    }
}

public class create_obj {
  
    public static void main(String[] args) {
        int p = 5;
        int q = 7;

        calculator calc = new calculator();
        System.out.println(calc.add(p,q));;
    }
}
