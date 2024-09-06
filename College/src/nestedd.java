import java.util.*;

class Bird {
    String color;

    interface Glidable {
        void glide();
    }

}

class nestedd implements Bird.Glidable {
    public void glide() {
        System.out.println("This bird can glide!");
    }

    public static void main(String[] args) {
        Bird.Glidable ob = new nestedd();
        ob.glide();
    }

}