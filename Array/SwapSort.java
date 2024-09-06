import java.util.*;
class SwapSort
{
    String wrd,swapwrd,sortwrd;
    int len;
    public SwapSort()
    {
        wrd=" ";
        len=0;
        swapwrd=" ";
        sortwrd=" ";
    }
    void readword()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word in UPPERCASE");
        wrd=sc.next();
        len=wrd.length();
    }
    void swapchar()
    {
        char ch1,ch2;
        ch1=wrd.charAt(0);
        ch2=wrd.charAt(len-1);
        swapwrd=ch2+wrd.substring(1,len-1)+ch1;
    }
    void sortword()
    {
        int i,j;
        for(i=65;i<=90;i++)
        {
            for(j=0;j<len;j++)
            {
                if(wrd.charAt(j)==i)
                {
                    sortwrd=sortwrd+wrd.charAt(j);
                }
            }
        }
    }
    void display()
    {
        System.out.println("ORIGINAL WORD: "+wrd);
        System.out.println("SWAPPED WORD: "+swapwrd);
        System.out.println("SORTED WORD: "+sortwrd);
    }
    public static void main (String args[])
    {
        SwapSort ob=new SwapSort();
        ob.readword();
        ob.swapchar();
        ob.sortword();
        ob.display();
    }
}
        
    