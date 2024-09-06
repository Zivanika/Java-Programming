import java.util.*;
class Palin
{
    int num,revnum;
    public Palin()
    {
        num=0;
        revnum=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
    }
    int reverse(int y) //Using Recursion
    {
        if(y>0)
        {
            revnum=revnum*10+y%10;
            return(reverse(y/10));
        }
        else
        return revnum;
    }
    void check()
    {
        int p=num;
        if (reverse(p)==num)
        {
            System.out.println("Palindrome");
        }
        else
        
            System.out.println("Not a Palindrome");
        
    }
    public static void main(String args[])
    {
        Palin ob=new Palin();
        ob.accept();
        ob.check();
    }
}
