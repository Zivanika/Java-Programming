class Pattern5
{
    public static void main (String args[])
    {
       
        int m=10;
        for (int i=1;i<=10;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for (int x=1;x<m;x++)
            System.out.print(" ");
            for(int k=i;k<=1;k++)
            {
                System.out.print(k+" ");
            }
               System.out.println();
               m-=3;
            }
            
    }
}