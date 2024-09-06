import java.util.*;
class Frequency_2
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,f=0,x;
        String str,str1="",str2="";
        System.out.println("Enter a sentence");
        str=sc.nextLine();
        System.out.println("Enter a String");
        str1=sc.next();
        str=str+' ';
        x=str.length();
        for(i=0;i<x;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                if(str2.compareTo(str1)==0)
                {
                    f=f+1;
                }
                str2="";
            }
            else 
               str2=str2+ch;
        }
        System.out.println("The Frequency of Repeated Words is "+f);
    }
}