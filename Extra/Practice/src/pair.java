import java.util.*;

class pair {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the specified number: ");
        int sn=sc.nextInt();
        System.out.println("All Pairs => ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==sn)
                {
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
