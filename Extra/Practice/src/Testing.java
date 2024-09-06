import java.util.*;

class Address {
    String a;

    void getAddress()
    {

    }

    void setAddress() {

    }
}

class HomeAddress extends Address {
    
    void getAddress() {
        super.getAddress();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Home Address: ");
        a = sc.nextLine();
    }

    void setAddress() {
        super.setAddress();
        System.out.println("Home Address is " + a);
    }
}
class OfficeAddress extends Address {
    
    void getAddress() {
        super.getAddress();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Office Address: ");
        a = sc.nextLine();
    }

    void setAddress() {
        super.setAddress();
        System.out.println("Office Address is " + a);
    }
}
class SchoolAddress extends Address {
    
    void getAddress() {
        super.getAddress();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter School Address: ");
        a = sc.nextLine();
    }

    void setAddress() {
        super.setAddress();
        System.out.println("School Address is " + a);
    }
}
class Testing{
    public static void main(String args[])
    {
        Address ob;
        ob=new HomeAddress();
        ob.getAddress();
        ob.setAddress();

        ob=new OfficeAddress();
        ob.getAddress();
        ob.setAddress();

        ob=new SchoolAddress();
        ob.getAddress();
        ob.setAddress();
    }
}
