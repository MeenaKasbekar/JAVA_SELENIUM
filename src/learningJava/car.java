package learningJava;

public class car {
    /*
    create class>>instance variables(attributes)>>static variables>>methods>>create another class
    >> object>> call the method
     */

    //instance variables
    String brandName;
    String color;
    int speed;
    String TransmissionType;

    //static variables
    static int noOfwheels=4;

    //Methods
    public void startCar(){
        System.out.println("Car Staring " + brandName);
    }

    public void stopCar(){
        System.out.println("Car Stopping " +brandName);
    }

    public void accelerateCar(int speed){
        System.out.println("accelerate car at speed: " +speed);
    }

    public void applyBreak(){
        System.out.println("Breaks Applied");
    }

    public void printDetails(){
        System.out.println("Brand Name: "+brandName);
        System.out.println("Color: "+color);
        System.out.println("Speed: "+speed);
        System.out.println("TransmissionType: "+TransmissionType);
    }
}
