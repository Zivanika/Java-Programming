import java.util.*;
class ArmNum
{
    public static Scanner sc=new Scanner(System.in);
    int n;
    int l;
    ArmNum(int nn)
    {
        n=nn;
        l=0;
    }
    int sum_pow(int i)
    {
        if (i>0)
        return (int)Math.pow(i%10,l)+sum_pow(i/10);
        else
        return 0;
    }
    void isArmstrong()
    {
        for(int i=n;i>0;i=i/10)
        ++l;
        int sum=sum_pow(n);
        if(sum==n)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an Armstrong number");
    }
    public static void main (String args[])
    {
        System.out.println("Enter a number");
        int m=sc.nextInt();
        ArmNum obj=new ArmNum(m);
        obj.isArmstrong();
    }
}