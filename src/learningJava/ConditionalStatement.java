package learningJava;

public class ConditionalStatement {
    public static void main(String[] args) {

        //=================IF Condition=====================
        boolean a= true;
        if(a=true){
            System.out.println("If block is executed");
        }

        //=========================IF ELSE Condition==================
        int age=16;
        if(age>18){
            System.out.println("Eligible to vote!!");
        }else{
            System.out.println("Not Eligible to vote!!");
        }

        //===============IF-elseif condition===============

        int x=10,y=20,z=30;
        if(x>y && x>z){
            System.out.println("X is greater");
        }
        else if (y>x && y>z) {
            System.out.println("Y is greater");
        }
        else {
            System.out.println("Z is greater");
        }

        //=============Switch Condition=================

        int day=3;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid choice");
        }

        //===========Automation Testing ====================

        String browser="chrome";

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Open Chrome");
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Open Firefox");
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.out.println("Open Edge");
        }else {
            System.out.println("Invalid browser selected");
        }
    }
}
