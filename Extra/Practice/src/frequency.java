import java.util.*;

class frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nNumber\t:\tFrequency");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = 0;
                    }
                }
                System.out.println(arr[i] + "\t:\t" + count);
            }
        }
    }
}