import java.util.*;
public class Addition {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result= a+b;
            System.out.println("The Addition of two numbers is "+result);
        }
    }
}
