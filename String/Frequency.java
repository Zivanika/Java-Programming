import java.util.*;
class Frequency
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int f=0;
        System.out.println("Enter the sentence");
        while(true)
        {
             String str=sc.next();
             if (str.equals("The")||str.equals("the"))
                 f++;
             if(str.equals("."))
             break;
        }
        System.out.println("Frequency of repeated word is"+f);
    }
}