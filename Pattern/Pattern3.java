class Pattern3
{
    public static void main (String args[])
    {
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=20;j++)
            {
                if(j==i || (i+j)==21 )          
                System.out.print("1");
                else
                System.out.print("0");
               
        }
        System.out.println();
    }
}
}