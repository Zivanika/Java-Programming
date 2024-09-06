interface Flyable {
    void fly();

    interface Glidable {
        void glide();
    }
}

class nestedinterface implements Flyable.Glidable {
    public void fly() {
        System.out.println("This bird can fly!");
    }

    public void glide() {
        System.out.println("This bird can glide!");
    }

    public static void main(String[] args) {
        nestedinterface ob = new nestedinterface();
        ob.glide();
        ob.fly();
    }
}
