import java.util.*;

class largest {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter three numbers one by one: ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        if (a>b && a>c)
        System.out.println("Largest Number is "+a);
        if (b>a && b>c)
        System.out.println("Largest Number is "+b);
        if (c>a && c>b)
        System.out.println("Largest Number is "+c);
    }
}