import java.util.*;
class Multiplication {
    public static void main (String[] args){
        int x,y,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two  numbers you want to multiply: ");
        x=sc.nextInt();
        y=sc.nextInt();
        for (int i=0;i<y;i++){
            sum+=x;
        }
        System.out.println("The Multiplication: "+sum);
    }
}
