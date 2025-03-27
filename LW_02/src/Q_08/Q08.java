package Q_08;


import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        float r=inpt.nextFloat();
        double pie=3.14;
        //float r3=r*r*r;
        double V=1.33*pie*(r*r*r);
        System.out.println("Volume Of the Sphere : "+V);

    }
}
