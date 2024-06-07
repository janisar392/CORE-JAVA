
enum Status
{
    Running , failed ,Pending ,Success;
}

public class Enum {
    public static void main(String[] args) {

        Status s = Status.Success;


        switch(s)
        {
            case Running:
            System.out.println("All GooD");
            break;

            case failed:
            System.out.println("Try Again");
            break;

            case Success:
            System.out.println("Done");
            break;

            default :
            System.out.println("Wait....");

        }
        
    }
}
