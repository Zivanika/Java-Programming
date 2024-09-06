class SeriesSum
{
    int x,n;
    double sum;
    public SeriesSum(int xx,int nn)
    {
        x=xx;
        n=nn;
        sum=0.0;
    }
    double findfact(int m)
    {
        if (m==1)
        {
            return(1);
        }
        else
        {
            return(m*findfact(m-1));
        }
    }
    double findpower(int x,int y)
    {
        if(y==0)
        {
            return(x);
        }
        else
        {
            return(x*findpower(x,y-1));
        }
    }
    void calculate()
    {
        int i;
        for(i=2;i<=n;i=i+2)
        {
            sum=sum+findpower(x,i)/findfact(i-1);
        }
    }
    void display()
    {
        System.out.println("Sum is:"+sum);
    }
    public static void main (String args[])
    {
        SeriesSum ob=new SeriesSum(2,6);
        ob.calculate();
        ob.display();
    }
}