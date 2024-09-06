import java.util.*;
class MatRev
{
    int arr[][];
    int m,n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display()  //NOT TO BE WRITTEN ON PROJECT
    {
       System.out.println("********************");
       System.out.println("ORIGINAL MATRIX");
       System.out.println("********************");
       for(int i=0;i<m;i++)
           {
             for(int j=0;j<n;j++)
             {
                System.out.print(arr[i][j]+" ");
             }
             System.out.println();
            }
    }
    int reverse(int x)
        {
            int r=0;
            while(x>0)
            {
                r=r*10+x%10;
                x=x/10;
            }
            return r;
        }
    void revMat(MatRev P)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    this.arr[i][j]=reverse(P.arr[i][j]);
                }
            }
        }
    void show()
        {
            System.out.println("*******************");
            System.out.println("REVERSE MATRIX");
            System.out.println("*******************");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                   System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    public static void main (String args[])
        {
            MatRev ob=new MatRev(4,4);
            ob.fillarray();
            ob.display();
            MatRev xy=new MatRev(4,4);
            xy.revMat(ob);
            xy.show();
        }
    }