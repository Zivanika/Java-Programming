import java.util.*;
class Num2WordsScanner
{
    public static void main (String args[])
    { 
        int i=4,rem=0,c=0;
        int arr[]=new int[4];
        String word[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred","Thousand"};
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your Number (less than 10000)");
        int num=sc.nextInt();
        while(num>0)
        { 
         rem=num%10;
         arr[--i]=rem;
         /*i--;*/
         num=num/10;
        }
        if (arr[0]!=0)
        {
        System.out.println(word[arr[0]-1]+" "+word[28]);
        if (arr[1]!=0)
        {
        System.out.println(word[arr[1]-1]+" "+word[27]);
        if ( arr[2]!=1)
           {
           System.out.println(word[arr[2]+17]);
           }
           else 
           c++;
           if (arr[2]==1)
          System.out.println(word[arr[3]+9]);
          else if (arr[2]==0 && arr[3]!=0)
            System.out.println(word[arr[3]-1]);
         }
       }
     }
    }
  