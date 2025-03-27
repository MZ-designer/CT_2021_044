package Q_05;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner frn=new Scanner(System.in);
        System.out.print("Enter Temperature : ");
        double frnh=frn.nextDouble();
        double cel=(0.556)*(frnh-32);
        System.out.println("Temperature in celsius : "+cel);
    }
}
