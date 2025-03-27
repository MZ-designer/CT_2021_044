package Q_03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner cels=new Scanner(System.in);
        System.out.print("Enter Temperature : ");
        double cel=cels.nextDouble();
        double fr=(1.8*cel)+32;
        System.out.println("Temperature in Fahrenheit : "+fr);
    }
}
