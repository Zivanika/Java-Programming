import java.util.*;
class MatrixSorting
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num[][]=new int[4][4];
        int i,k,j,temp;
        System.out.println("Enter the elements in the matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements are");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                for(k=j+1;k<4;k++)
                {
                    if (num[i][j]>num[i][k])
                    {
                        temp=num[i][j];
                        num[i][j]=num[i][k];
                        num[i][k]=temp;
                    }
                }
            }
        }
        System.out.println("Elements after sorting are");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}