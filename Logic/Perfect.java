import java.util.*;
class Perfect
{
    int num;
    public Perfect(int nn)
    {
        num=nn;
    }
    public int sum_of_factors(int i)
    {
        if(i==num)
        return 0;
        else if(num%i==0)
        return i+sum_of_factors(i+1);
        else
        return sum_of_factors(i+1);
    }
    public void check()
    {
        int s=sum_of_factors(1);
        if(s==num)
        System.out.println(num+" is a fucking perfect number!!");
        else
        System.out.println(num+" is not a perfect number");
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        Perfect obj=new Perfect(num);
        obj.check();
    }
}