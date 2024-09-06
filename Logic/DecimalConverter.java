import java.util.Scanner;
class DecimalConverter
{
    public static void main (String args[])
    {
        double rem=1,a=0,s=0,p=1;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1 to Convert Binary to Decimal");
        System.out.println("Enter 2 to Convert Octal to Decimal");
        System.out.println("Enter 3 to Convert Hexadecimal to Decimal");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
        System.out.println("Enter a binary number");
        long num = sc.nextLong();
        while (num>0)
        {
            rem=num%10;
            p=rem*Math.pow(2,a);
            s=s+p;
            a++;
            num=num/10;
        }
        System.out.println("Decimal Number is "+s);
        break;
       }
           case 2:
           {
           System.out.println("Enter a Octal number");
        int num = sc.nextInt();
        while (num>0)
        {
            rem=num%10;
            p=rem*Math.pow(8,a);
            s=s+p;
            a++;
            num=num/10;
        }
        System.out.println("Decimal Number is "+s);
        break;
      }
      case 3:
      {
          System.out.println("Enter a Hexadecimal number");
        int num = sc.nextInt();
        while (num>0)
        {
            rem=num%10;
            p=rem*Math.pow(16,a);
            s=s+p;
            a++;
            num=num/10;
        }
        System.out.println("Decimal Number is "+s);
        break;
    }
    default:
    System.out.println("Invalid Choice");
  }
}
}
       