import java.util.*;
class Adder
{
    int a[];
    public Adder()
    {
        a=new int[2];
        a[0]=0;
        a[1]=0;
    }
    void readtime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours and minutes");
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
    }
    void addtime(Adder X,Adder Y)
    {
        a[1]=X.a[1]+Y.a[1];
        a[0]=a[1]/60;
        a[1]=a[1]%60;
        a[0]+=X.a[0]+Y.a[0];
    }
    void disptime()
    {
        System.out.println("Hours="+a[0]+" and Minutes="+a[1]);
    }
    public static void main (String args[])
    {
        Adder T1=new Adder();
        Adder T2=new Adder();
        Adder T3=new Adder();
        T1.readtime();
        T2.readtime();
        T3.addtime(T1,T2);
        T3.disptime();
    }
}