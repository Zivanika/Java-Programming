import java.util.*;

class sum_of_diagonals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        int size = sc.nextInt();
        int mat[][] = new int[size][size];
        int sumrd = 0, sumld = 0;
        System.out.println("Enter elements in the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n-------MATRIX--------\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sumld += mat[i][j];
                }
                if ((i + j) == (size - 1)) {
                    sumrd += mat[i][j];
                }
            }
        }
        System.out.println("\nSum of Left Diagonal: "+sumld);
        System.out.println("\nSum of Right Diagonal: "+sumrd);
    }
}