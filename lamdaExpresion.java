

@FunctionalInterface   // Only One Funtion here
interface A 
{
    void show(int i);
}

public class lamdaExpresion {
    public static void main(String[] args) {
        
        A obj = i -> System.out.println("In A show : " + i);    // lamda Expresion
        obj.show(5);
    }
    
}
