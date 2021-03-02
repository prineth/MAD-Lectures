public class person
{
    private String name;
    
    private String getName()
    {
        return name;
    }
    
    private void setName(String newName)
    {
        this.name = newName;
    }
}

public class main()
{
    public static void main (String[] args)
    {
        person myObj = new person();
        myObj.name = "Nimal";
        System.out.println(myObj.name);
    }

}