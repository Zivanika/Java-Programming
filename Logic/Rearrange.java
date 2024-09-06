import java.util.Scanner;
class Rearrange
{
    String wrd,newwrd;
    Rearrange()
    {
        wrd=newwrd=" ";
    }
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Accept a word in upper case");
        wrd=sc.nextLine();
    }
    void freq_vow_con()
    {
        int vc=0,cc=0;
        int l=wrd.length();
        for(int i=0;i<l;i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            vc++;
            else
            cc++;
        }
        System.out.println("Frequency of vowel:"+vc);
        System.out.println("Frequency of consonant:"+cc);
    }
    void arrange()
        {
            String v=" ",c=" ";
            int l=wrd.length();
            for(int i=0;i<1;i++)
            {
                char ch=wrd.charAt(i);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    v=v+ch;
                }
                else
                {
                    c=c+ch;
                }
                newwrd=v+c;
            }
        }
    void display()
        {
            System.out.println("Original word:"+wrd);
            System.out.println("Rearranged word:"+newwrd);
        }
    public static void main(String args[])
        {
            Rearrange ob=new Rearrange();
            ob.readword();
            ob.freq_vow_con();
            ob.arrange();
            ob.display();
        }
    }