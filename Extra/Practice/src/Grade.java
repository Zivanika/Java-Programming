import java.util.*;

import javax.lang.model.util.ElementScanner14;

class Grade {
    public static void main(String args[]) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter Your Percentage: ");
            double per = Sc.nextDouble();
            if (per >= 90 && per <= 100) {
                System.out.println("\nOutstanding");
            } else if (per >= 80 && per < 90) {
                System.out.println("\nExcellent");
            } else if (per >= 70 && per < 80) {
                System.out.println("\nVery Good");
            } else if (per >= 60 && per < 70) {
                System.out.println("\nGood");
            } else if (per >= 50 && per < 60) {
                System.out.println("\nSatisfactory");
            } else if (per >= 40 && per < 50) {
                System.out.println("\nPoor");
            } else {
                System.out.println("\nFailed");
            }
        }
    }
}
