// import java.util.*;

// public class prime {
//     public static void main(String args[]) {
//         int count = 0;
//         int n = Integer.parseInt(args[0]);
//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 count++;
//             }
//         }
//         if (count == 2) {
//             System.out.println("Prime");
//         } else {
//             System.out.println("Not Prime");
//         }
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number: ");
// int n = sc.nextInt();
// int count = 0;
// for (int i = 1; i <= n; i++) {
// if (n % i == 0) {
// count++;
// }
// }
// if (count == 2) {
// System.out.println("Prime");
// }
// else
// {
// System.out.println("Not Prime");
// }
//     }
// }
class prime {
public static void main(String arg[])
{
int n=Integer.parseInt(arg[0]);
int f=0;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.println("The number is not prime");
f=1;
break;
}
}
if(f==0)
{
System.out.println("The number is prime");
}
}
}
