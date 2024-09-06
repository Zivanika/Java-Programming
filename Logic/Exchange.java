import java.util.*;
public class Exchange
{
    String sent,rev;
    int size;
    Exchange()
    {
        sent="";
        rev="";
    }
    void readSentence()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
        size=sent.length();
    }
    void exfirstlast()
    {
        int p=0;
        char ch;
        String b;
        for (int i=0;i<size;i++)
        {
            ch=sent.charAt(i);
            if(ch==' ' || ch=='.')
            {
                b=sent.substring(p,i);
                if(b.length()!=1)
                {
                    rev=rev+b.charAt(b.length()-1);
                    rev=rev+b.substring(1,b.length()-1);
                    rev=rev+b.charAt(0);
                }
                else
                    
                   rev=rev+b;
                    rev=rev+"";
                    p=i+1;
                 
              }
           }  
        }
    void display()
    {
        System.out.println("\nInput:"+sent);
        System.out.println("\nOutput:"+rev);
    }
    public static void main (String args[])
    {
        Exchange ob= new Exchange();
        ob.readSentence();
        ob.exfirstlast();
        ob.display();
    }
}