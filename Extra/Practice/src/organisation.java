import java.util.*;

class Employee {
    String departmentID, employeeID;

    Employee(String d, String e) {
        departmentID = d;
        employeeID = e;
    }

    void show() {
        System.out.println("________________________");
        System.out.println(" EMPLOYEE DETAILS");
        System.out.println("------------------------");
        System.out.println("Department ID: " + departmentID);
        System.out.println("Employee ID: " + employeeID);
    }
}

class Manager extends Employee {

    Manager(String d, String e) {
        super(d, e);
    }

    void cash(int n) {
        System.out.println("Total Cash: " + 0.5 * n * 400 + " -/");
    }
}

class Worker extends Employee {

    Worker(String d, String e) {
        super(d, e);
    }

    void cash(int n) {
        System.out.println("Total Cash: " + n * 500 + " -/");
    }
}

class Others extends Employee {

    Others(String d, String e) {
        super(d, e);
    }

    void cash(int n) {
        System.out.println("Total Cash: " + n * 600 + " -/");
    }
}

class organisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee ob;
        System.out.println("Enter your designation => ");
        System.out.println("1. Manager");
        System.out.println("2. Worker");
        System.out.println("3. Others");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        System.out.println("Enter your Department ID");
        sc.skip("\\R?");
        String d = sc.nextLine();
        System.out.println("Enter your Employee ID");
        sc.skip("\\R?");
        String e = sc.nextLine();
        System.out.println("Enter Number of days: ");
        int n = sc.nextInt();
        switch (ch) {
            case 1:
                Manager m = new Manager(d, e);
                m.show();
                m.cash(n);
                break;
            case 2:
                Worker w = new Worker(d, e);
                w.show();
                w.cash(n);
                break;
            case 3:
                Others o = new Others(d, e);
                o.show();
                o.cash(n);
                break;
            default:
                System.out.println("Wrong Choice!");
        }
    }
}
