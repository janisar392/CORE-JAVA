public class ExceptionHandlinng {
    public static void main(String[] args) {
        

        int a = 4;
        int b = 0;

        int nums[] = new int[5];
        String str = null;
        
        try
        {
            b = 24/a;
            
            
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in limit in Array");
        }
       
        catch(Exception e)
        {
            System.out.println("Something went wrong " +e);
        }
        

        System.out.println(b);

        System.out.println("Hey ! ");
    }
}
