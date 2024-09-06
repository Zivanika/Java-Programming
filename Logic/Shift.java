import java.util.*;
class Shift
{
    int mat[][],m,n;
    public Shift(int  mm,int nn)
    {
        m=mm;
        n=nn;
        mat=new int[m][n];
    }
    void input()
    {
        int i,j;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number=>");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    void show()
        {
            System.out.println("******************");
            System.out.println("ORIGINAL MATRIX");
            System.out.println("******************");
            int i,j;
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    void cyclic(Shift P)
    {
        int i,j;
        for (i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
             {
                 if(i!=0)
                 mat[i-1][j]=P.mat[i][j];
                 else
                 mat[m-1][j]=P.mat[0][j];
                }
            }
        }
    void display()
        {
            System.out.println("******************");
            System.out.println("SWAPPED MATRIX");
            System.out.println("******************");
            int i,j;
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    public static void main (String args[])
        {
            Shift A=new Shift(4,4);
            Shift B=new Shift(4,4);
            A.input();
            A.show();
            B.cyclic(A);
            B.display();
        }
    }