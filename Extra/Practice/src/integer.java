import java.util.*;

public class integer {
    Scanner sc = new Scanner(System.in);
    int n;
    int arr[] = new int[100];

    void getdata() {
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Array before swapping: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void swapping() {
        System.out.println("\n");
        int max = 0;
        int amx = 0;
        int min = 0;
        int ami = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                amx = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                ami = i;
            }
        }
        int temp = arr[amx];
        arr[amx] = arr[ami];
        arr[ami] = temp;
        System.out.println("The array after swapping the largest and the smallest element is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String args[]) {
        integer obj1 = new integer();
        obj1.getdata();
        obj1.display();
        obj1.swapping();
    }
}