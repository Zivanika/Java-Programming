import java.util.Scanner;
class Decimal_Decoder
{
    public static void main (String args[])
    {
        int rem=1;
        String s=" ";
        Scanner sc = new Scanner (System.in);
        System.out.println("Press 1 for Decimal to Binary Conversion");
        System.out.println("Press 2 for Decimal to Octal Conversion");
        System.out.println("Press 3 for Decimal to Hexadecimal Conversion");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch (ch)
         {
             case 1:
             {
        System.out.println("Enter a Decimal Number");
        int num=sc.nextInt();
        while (num>0)
        {
            rem=num%2;
            s=Integer.toString(rem)+s;
            num=num/2;
        }
        System.out.println("Binary Number is "+s);
        break;
       }
           case 2:
           {
               System.out.println("Enter a Decimal Number");
        int num=sc.nextInt();
        while (num>0)
        {
            rem=num%8;
            s=Integer.toString(rem)+s;
            num=num/8;
        }
        System.out.println("Octal Number is "+s);
        break;
       }
       case 3:
       {
           System.out.println("Enter a Decimal Number");
        int num=sc.nextInt();
        while (num>0)
        {
            rem=num%16;
            s=Integer.toString(rem)+s;
            num=num/16;
        }
        System.out.println("Hexadecimal Number is "+s);
        break;
       }
       default:
       System.out.println("Invalid Input");
   }
  }
}