import java.util.*;
class MatrixSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,s=0;
        System.out.println("Enter the row and column of the matrix:");
        n=sc.nextInt();
        m=sc.nextInt();
        int a[][]=new int [n+1][m+1];
        System.out.println("Enter elements in the matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix elements are=");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            s=0;
            for(j=0;j<m;j++)
            {
                s=s+a[i][j];
            }
            a[i][m]=s;
        }
        for(i=0;i<n;i++)
        {
            s=0;
            for(j=0;j<m;j++)
            {
                s=s+a[j][i];
            }
            a[n][i]=s;
        }
        System.out.println("Matrix with sum of each row and column=");
        for(i=0;i<n+1;i++)
        {
            for(j=0;j<m+1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}