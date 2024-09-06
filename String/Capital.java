import java.util.*;
class Capital
{
    String sent;
    int freq;
    public Capital()
    {
        sent=" ";
        freq=0;
    }
    public void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence");
        sent=sc.nextLine();
    }
    public boolean isCap(String w)
    {
        if (Character.isUpperCase(w.charAt(0)))
        return true;
        else
        return false;
    }
    public void display()
    {
        System.out.println("Given string:"+sent);
        String b=" "+sent;
        char c;
        for(int i=0;i<b.length();i++)
        {
            c=b.charAt(i);
            if (c==' ')
            {
                if (Character.isUpperCase(b.charAt(i+1)))
                freq++;
            }
        }
        System.out.println("Number of words beginning with Capital letters:"+freq);
    }
    public static void main(String args[])
    {
        Capital ob=new Capital();
        ob.input();
        ob.display();
    }
}