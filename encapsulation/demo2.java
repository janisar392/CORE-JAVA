
class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a ;
    }

    public String getString()
    {
        return name;
    }
    public void setString(String name)
    {
        this.name = name ;
    }
}

public class demo2 {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(30);
        obj.setString("Rahul"); 

    
        System.out.println(obj.getString() + " : "+ obj.getAge());
    }
}
