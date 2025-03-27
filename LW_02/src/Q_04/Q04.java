package Q_04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner BW=new Scanner(System.in);
        System.out.print("Enter Your Body Weight : ");
        double BWT=BW.nextDouble();
        double clri=BWT*19;
        System.out.println("Number Of Calories : "+clri);

    }
}
