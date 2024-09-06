import java.io.*;
class Factorial
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no.=");
        int n=Integer.parseInt(br.readLine());
        Factorial ob=new Factorial();
        long f=ob.fact(n);
        System.out.println("Factorial="+f);
    }
    public long fact(int n)
    {
        if(n<2)
        return 1;
        else 
        return (n*fact(n-1));
    }
}