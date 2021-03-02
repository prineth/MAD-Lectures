class vehical
{
    protected String brand = "Merc";
    
    public void Honk()
    {
        System.out.println("Tuut,tuut!");
    }
}

class Car extends Vehicle
{
    private String model = "E200";
}
public class Main
{
    public static void main (String[] args) 
    {
        Car myCar = new Car();
        myCar.Honk();
        System.out.println(myCar.brand + " : " + myCar.model);    
        
    }
}