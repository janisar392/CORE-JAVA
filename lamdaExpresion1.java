
@FunctionalInterface
interface A 
{
     int add(int a , int b);
}
public class lamdaExpresion1 {
    public static void main(String[] args) {

        A obj =  ( a, b) -> a+b ;         // lamda Expresion with return type
        System.out.println(obj.add(5,8));
        
    }
    
}
