package Q_07;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner Weight=new Scanner(System.in);
        System.out.println("Enter Your Weight :  ");
        int w=Weight.nextInt();

        Scanner Height=new Scanner(System.in);
        System.out.println("Enter Your Height :  ");
        int h=Height.nextInt();

        double bmi=w/((h/100.0)*(h/100.0));
        if (bmi<=25 && bmi>=20){
            System.out.println("BMI Value is Normal");
        }
        else System.out.println("BMI Value is not Normal");
    }
}
