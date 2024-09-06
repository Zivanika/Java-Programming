class Pattern
{
    public static void main (String args[])
    {
        int p=10, m=1;
        for (int i=1;i<=10;i++)
        {
            for (int j=1;j<p;j++)
            {
                System.out.print(j+" ");
            }
            for (int k=1;k<m;k++)
            {
                System.out.print(" ");
            }
            for (int k=p;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            p-=1;
            m+=4;
        }
    }
}