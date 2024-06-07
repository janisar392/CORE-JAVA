public class ExceptionHandlinng1 {
    public static void main(String[] args) 
    {
        

        int i = 0;
        int j = 0;
    
        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException();

        }

        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("Thats the default value : "+j);
        }

        catch(Exception e)
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println("Ans :"+j);
        
    }

       
}
