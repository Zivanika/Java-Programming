import java.util.*;
class Mixer
  { int arr[];
    int n;
    static Scanner sc=new Scanner(System.in);
    Mixer (int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()
    {
        System.out.println("Enter "+n+" elements in ascending order");
        for (int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
    }
    Mixer mix (Mixer A)
    {
        Mixer B=new Mixer(n+A.n);
        int x=0;
        for(int i=0;i<n;i++)
           B.arr[x++]=arr[i];
            for (int j=0;j<A.n;j++)
            B.arr[x++]=A.arr[j];
            return B;
    }
    void display()
        {
            for (int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
    static void main()
            {
                Mixer P=new Mixer(4);
                Mixer Q=new Mixer(3);
                Mixer R=new Mixer(7);
                P.accept();
                Q.accept();
                R=P.mix(Q);
                R.display();
           }
}
                