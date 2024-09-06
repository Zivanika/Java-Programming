class TheString
{
    String str;
    int len,wordcount,cons;
    public TheString()
    {
        str=" ";
        wordcount=0;
        cons=0;
    }
    public TheString(String s)
    {
        str=s;
        str=str+' ';
        len=str.length();
    }
    void countFreq()
    {
        int i;char ch;
        str=str.toLowerCase();
        for(i=0;i<len;i++)
        {
            ch=str.charAt(i);
            if (ch==' ')
            {
                wordcount++;
            }
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&ch!=' ')
            {
                cons++; //wordcount-cons and ++wordcount
            }
        }
    }
    void Display()
    {
        System.out.println("Original String:"+str);
        System.out.println("Total Words "+wordcount);
        System.out.println("Total Consonants "+cons);
    }
    public static void main(String args[])
    {
        TheString ob=new TheString("India is my country");
        ob.countFreq();
        ob.Display();
    }
}