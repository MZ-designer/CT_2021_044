package Q_09;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter invest amount (P): ");
        double invest = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years (N): ");
        int years = scanner.nextInt();

        double amount = invest * Math.pow(1 + (rate / 100), years);

        System.out.printf("The amount after %d years is: %.2f", years, amount);
    }
}
