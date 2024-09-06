class Pattern4
{
    public static void main (String args[])
    {   int m=1,c=0;
        for (int i=10;i>=1;i--)
        {
            for(int k=1;k<=m;k++)
            System.out.print(" ");
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
                
            }
            for (int x=1;x<=10;x++)
            {
                for (int y=1;y<=i;y++)
                {
                    if (y==1)
                    System.out.print(" ");
                    else
                    c=c+1;
                }
            }
            for (int z=i;z>=1;z--)
            {
             System.out.print(z+" ");
            }
            System.out.println();
            m+=2;
        }
    }
}