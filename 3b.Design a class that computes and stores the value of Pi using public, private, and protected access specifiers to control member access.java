class PiValue {
    public double pi1 = 3.14;
    protected double pi2 = 3.14;
    private double pi3 = 3.14;

    void display() {
        System.out.println(pi1);
        System.out.println(pi2);
        System.out.println(pi3);
    }
}

public class Main {
    public static void main(String[] args) {
        PiValue p = new PiValue();
        p.display();
    }
}
