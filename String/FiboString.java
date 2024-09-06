import java.util.*;
class FiboString
{
    String x,y,z;
    int n;
    public FiboString()
    {
        x="a";
        y="b";
        z="ba";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();
    }
    void generate()
    {
        int i;
        System.out.print(x+" "+y+" ");
        for (i=3;i<=n;i++)
        {
            z=y+x;
            x=y;
            y=z;
            System.out.print(z+" ");
        }
    }
    public static void main (String args[])
    {
        FiboString ob=new FiboString();
        ob.accept();
        ob.generate();
    }
}