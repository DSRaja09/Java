abstract class Vehicle{
    private int registrationNo;
    private String owner;
    private String model;
    private String type;
    
    public void VehicleInfo(){
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        // System.out.println("Status " + abc);
    }
    public void getDetails(){
        System.out.println("Registration number is " + registrationNo + " Owned by " + owner);
    }
}
public class MyProject {
    public static void main(String[] args) {
        
    }
}
