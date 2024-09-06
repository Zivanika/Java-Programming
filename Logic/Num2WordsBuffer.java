import java.io.*;
class Num2WordsBuffer
{
    public static void main (String args[]) throws IOException
      {
          BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
          System.out.println("Enter any number (less than 99 b)");
          int amt=Integer.parseInt(br.readLine());
          int z,g;
          String x[]={" ","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
          String x1[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
          String x2[]={" ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
          z=amt%10;
          g=amt/10;
          if (g!=1)
          System.out.println(x2[g-1]+" "+x1[2]);
          else
          System.out.println(x[amt-9]);
        }
    }