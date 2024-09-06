import java.util.*;

class Bank {
    int bal;

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        int amt = sc.nextInt();
        bal = bal + amt;
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amt = sc.nextInt();
        bal = bal - amt;
    }

    void Show() {
        System.out.println("________________________");
        System.out.println(" ACCOUNT DETAILS");
        System.out.println("------------------------");
        System.out.println("Current Balance: " + bal+" Rs");
    }

    public static void main(String args[]) {
        Bank ob = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the balance: ");
        ob.bal = sc.nextInt();
        ob.deposit();
        ob.Show();
        ob.withdraw();
        ob.Show();
    }
}
