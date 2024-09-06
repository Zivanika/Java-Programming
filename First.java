import java.util.Scanner;
class First
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        System.out.println("Enter your roll no.: ");
        roll=sc.nextInt();
        System.out.println("Enter Name: ");
        name=sc.next();
        System.out.println("Name: "+name+"\nRoll No: "+roll);

    }
}
class Second extends First{

}
