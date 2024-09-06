import java.util.Scanner;

class Student {
    int roll_no;
    String Course;

    void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Roll No: ");
        roll_no = sc.nextInt();
        System.out.print("Enter Course you want to enroll in: ");
        sc.skip("\\R?");
        Course = sc.nextLine();
    }
}

class Kiitian extends Student {
    String h;

    void hostel_request() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which Hostel you want for accommodation: ");
        h = sc.nextLine();
    }

    void display() {
        System.out.println("________________________");
        System.out.println(" STUDENT DETAILS");
        System.out.println("------------------------");
        System.out.println("Roll No: " + roll_no);
        System.out.println("Course: " + Course);
        System.out.println("Hostel: " + h);
    }

    public static void main(String[] args) {
        Kiitian ob = new Kiitian();
        ob.register();
        ob.hostel_request();
        ob.display();
    }
}