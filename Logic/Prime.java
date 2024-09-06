import java.util.*;
class Prime
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int no,c=0;
        System.out.println("Enter the number");
        no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
               c=c+1;
        }
        if(c==2)
        
            System.out.println("Number is a Prime Number");
        else
            System.out.println("Number is NOT a Prime Number");
        }
    }
                