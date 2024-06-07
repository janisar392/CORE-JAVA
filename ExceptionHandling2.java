
class AkhtarException extends RuntimeException
{
    public AkhtarException(String string) 
    {
        super(string);
    }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {

        int i = 20 ;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new AkhtarException("i Don't wanna print value");
            }
            
        }
        catch(AkhtarException e) {
            j = 18/1;
            System.out.println("This is default value J : "+j+e);
        }
        catch(Exception e) {
            System.out.println("Something went wronng "+e);
        }
        
        System.out.println("J : "+j);
    }
}
