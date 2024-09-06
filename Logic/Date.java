import java.util.*;
class Date

{
    public static void main (String args[])
    {
        Scanner sc= new Scanner (System.in);
        String month[]={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
        int dm[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int i,j,c=0,a=0;
        long d,y,days,date;
        System.out.println("enter a date value not less than 5 digits");
        d = sc.nextLong();
        while(d<10000||d%10000<1900||d%10000>3000)
        {
            System.out.println("Invalid data. re - enter value not less than 5 digits");
            d=sc.nextLong();
        }
        y=d%10000;
        days=d/10000;
        if(days>365)
        {
            while(days>365)
            {
                y++;
                if(y%4==0)
                {
                    dm[2]=29;
                    days=days-366;
                }
                else
                {
                    dm[2]=28;
                    days=days-365;
                }
            }
        }
        else
        {
            if(y%4==0)
            dm[2]=29;
            else
            dm[2]=28;
        }
        for(i=1;i<=12;i++)
        {
            c=c+dm[i];
            if(c>days)
            {
            a=i;
            break;
            }
        }
       c=0;
            for(j=1;j<i;j++)
        {
            c=c+dm[j];
        }
        date=days-c;
        System.out.println("The required date as per the entered date vaalue:");
        if(date==0)
        System.out.println(dm[a-1]+" "+month[a-1]+" "+y);
        else
        System.out.println(date+" "+month[a]+" "+y);
    }
}
