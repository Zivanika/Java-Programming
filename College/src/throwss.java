public class throwss {
    static void throwOne() throws NullPointerException {
        System.out.println("Inside the method throwOne()");
        throw new NullPointerException("second");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}