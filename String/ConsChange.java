import java.util.*;
class ConsChange
{
    String word;
    int len;
    public ConsChange()
    {
        word="";
        len=0;
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word in lower case");
        word=sc.next();
        len=word.length();
    }
    void shiftcons()
    {
        String v="",
        c="";
        int i;
        char ch;
        for(i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v=v+ch;
            }
            else
            {
                c=c+ch;
            }
        }
        word=c+v;
        System.out.println("shifted word is "+word);
    }
    void changeword()
    {
        int i;
        char ch;
        String s="";
        for(i=0;i<len;i++)
        {
            ch=word.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                s=s+(char)(ch-32);
            }
            else
            {
            s=s+ch;
            }
        }
        System.out.println("changed word is "+s);
    }
    void show()
    {
        System.out.println("original word is "+word);
        shiftcons();
        changeword();
    }
    public static void main (String args[])
    {
        ConsChange ob=new ConsChange();
        ob.readword();
        ob.show();
    }
}