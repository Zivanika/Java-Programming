import java.util.*;
class StringSorting
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        String words[]=new String[50];
        int i,j,k,n=0,c,len;
        char ch,ch1;
        String str,temp=" ";
        System.out.println("Enter a sentence that terminate with a full stop");
        str=sc.nextLine();
        str=str.toLowerCase();
        len=str.length();
        for (i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if(ch!=' ' && ch!='.')
            {
               temp=temp+ch;
            }
            else
            {
                words[n++]=temp;
                temp=" ";
            }
        }// end of a loop
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(words[i].length()<words[j].length())
                {
                    temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
                if(words[i].length()==words[j].length())
                {
                    if(words[i].compareTo(words[j])>0)
                    {
                        temp=words[i];
                        words[i]=words[j];
                        words[j]=temp;
                    }
                }
            } // end of j loop
        }  // end of i loop
        System.out.println("The words present in the sentence arranged in descending order:");
        for(k=0;k<n;k++)
        {
            ch=words[k].charAt(0);
            ch1=Character.toUpperCase(ch);
            words[k]=ch1+words[k].substring(1);
            System.out.print(words[k]+" ");
        }
        System.out.print(".");
    }
}