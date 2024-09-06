import java.util.*;
class Disarium
{
    int num,size,s=0;
    static Scanner sc=new Scanner (System.in);
    public Disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigits()
    {
        int a=num;
        while(a!=0)
        {
            size++;
            a=a/10;
        }
    }
    int sumOfDigits(int n,int p)
    {
        return (n==0)? 0: sumOfDigits(n/10,p-1)+(int)Math.pow(n%10,p);
    }
    void check()
    {
        if (sumOfDigits(num,size)==num)
        {
            System.out.println("\n Disarium Number");
        }
        else
        {
            System.out.println("\n Not a Disarium Number");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Input a Number");
        int m=sc.nextInt();
        Disarium ob=new Disarium(m);
        ob.countDigits();
        ob.check();
    }
}