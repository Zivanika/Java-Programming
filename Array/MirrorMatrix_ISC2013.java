import java.util.*;
class MirrorMatrix_ISC2013
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of the square matrix:");
        int m=sc.nextInt();
        if(m<3 && m>19)
        {
        System.out.println("Size out of the range");
        return;
        }
        int A[][]=new int[m][m];int B[][]=new int[m][m];
        int p=0;
        int q=m-1;
        System.out.println("Enter the elements in the matrix");
        for(int i=0;i<m;i++)
        {
            q=m-1;
            for(int j=0;j<m;j++)
            {
            A[i][j]=sc.nextInt();
            B[i][q]=A[i][j];
            q--;
            }
           // p++;
        }
        System.out.println("Output:-\n******************");
        System.out.println("The Original Matrix");
        System.out.println("*******************");
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("*******************");
        System.out.println("The Mirror Matrix");
        System.out.println("*******************");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
    }
}