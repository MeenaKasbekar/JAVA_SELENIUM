package learningJava;

public class carDemo {

    public static void main(String[] args) {

        //objects created
        car c1=new car();
        car c2=new car();

        c1.brandName="tesla";
        c1.color="Black";
        c1.speed=300;
        c1.TransmissionType="Automatic";

        c2.brandName="kia";
        c2.color="white";
        c2.speed=100;
        c2.TransmissionType="Manual";

        //method call
        c1.printDetails();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        c2.printDetails();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        c1.startCar();
        c1.accelerateCar(10);
        c1.applyBreak();
        c1.startCar();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        c2.startCar();
        c2.accelerateCar(15);
        c2.applyBreak();
        c2.stopCar();



    }
}
