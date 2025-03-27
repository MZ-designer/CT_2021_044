package Q_06;

import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       Scanner inpt=new Scanner(System.in);
         System.out.print("Enter Born year : ");
         int yr=inpt.nextInt();
        int yr_count = Year.now().getValue()-yr;
        System.out.println("You were born in "+yr+" and will be "+yr_count+" this year");
    }
}
