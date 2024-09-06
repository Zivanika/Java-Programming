class Pattern2
{
    public static void main (String args[])
    {
        for(int i=1;i<=19;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==2 || i==4 || i==6 || i==8 || i==10 || i==12 || i==14 || i==16 || i==18)
                System.out.print("x ");
                else
                System.out.print("$ ");
               
        }
        System.out.println();
    }
}
}