import java.util.*;
class Merger
{
    long n1,n2,mergNum;
    public Merger()
    {
        n1=0;
        n2=0;
        mergNum=0;
    }
    void readNum()
    {
        Scanner x=new Scanner (System.in);
        System.out.println("Enter two numbers");
        n1=x.nextLong();
        n2=x.nextLong();
    }
    void  joinNum()
    {
        int p=1;
        long t=n2;
        while(t>0)
        {
            p=p*10;
            t=t/10;
        }
        mergNum=n1*p+n2;
    }
    void show()
    {
        System.out.println("Original numbers are "+n1+" and "+n2);
        System.out.println("Merged number is "+ mergNum);
    }
    public static void main(String args[])
    {
        Merger ob=new Merger();
        ob.readNum();
        ob.joinNum();
        ob.show();
    }
}