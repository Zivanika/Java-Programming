public class trycatchclause {
    static void demoproc() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught Inside demoproc()");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
