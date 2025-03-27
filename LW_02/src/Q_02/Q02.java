package Q_02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        System.out.println("Enter Length ");
        double inc=inpt.nextDouble();
        System.out.println("Inches :"+(inc/2.54));
        System.out.println("Feet : "+((inc/2.54)/12));
    }
}
