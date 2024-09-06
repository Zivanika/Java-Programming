import java.io.IOException;

public class IO {
    static void I() throws IOException {

        int i = System.in.read();
    }

    public static void main(String[] args) {
        System.out.println("Harshuuuuuuuuuuuuuuuuuuuuuuu");
        System.err.println("Harshuuuuuuuuuuuuuu");
        try {

            I();
        } catch (IOException e) {
            
        }
    }
}
