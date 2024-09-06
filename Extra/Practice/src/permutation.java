import java.util.*;

public class permutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        char ch;
        int p = str.length();
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < p; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println((char) (str.charAt(i)) + (char) str.charAt(j) + (char) str.charAt(k));
                    }
                }
            }
        }

    }
}
