import java.util.*;

class even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers one by one: ");
        int arr[] = new int[10];
        int evarr[] = new int[10];
        int odarr[] = new int[10];
        int ev=0,od=0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                evarr[ev++] = arr[i];
            }
            if (arr[i] % 2 != 0) {
                odarr[od++] = arr[i];
            }
        }
        System.out.print("Even Numbers are: ");
        for (int i=0;i< ev ; i++)
        {
            System.out.print(evarr[i] +"  ");
        }
        System.out.println();
        System.out.print("Odd Numbers are: ");
        for (int i=0;i< od ; i++)
        {
            System.out.print(odarr[i] +"  ");
        }
    }
}