public class person
{
    private String name;
    
    public String get name(){
        return name;
    }
    
    pubic void setName(String newName){
        this.name = newName;
    }
}

public class main(){
    public static void main (String[] args){
        person myObj = new person();
        myObj.name ="Nimal";
        System.out.println(myObj.name);
    }
}