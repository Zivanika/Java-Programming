import java.util.*;

class complex{
    int real;
    int ima;

    complex() {
        real = 0;
        ima = 0;
    }

    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part: ");
        real=sc.nextInt();
        System.out.println("Enter imaginary part: ");
        ima=sc.nextInt();
    }

    complex Add(complex ob2) {
        complex t = new complex();
        t.real = real + ob2.real;
        t.ima = ima + ob2.ima;
        return t;
    }
}

class democ {
    public static void main(String args[]) {
        complex ob = new complex();
        System.out.println("1st Complex Number");
        ob.get();
        complex ob2 = new complex();
        System.out.println("2nd Complex Number");
        ob2.get();
        complex result;
        result=ob.Add(ob2);
        System.out.println("Addition of real part: "+result.real);
        System.out.println("Addition of imaginary part: "+result.ima);
    }
}
