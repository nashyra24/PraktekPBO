package UTS;

// Child Class - Inheritance
public class Opor extends Makanan {
    public int santan;
    public int ayam;

    // Overriding
    @Override
    public void masak() {
        System.out.println("Opor sedang di masak dengan santan dan ayam");
    }

    // Overloading
    public void masak(String tingkatPedas) {
        System.out.println("Opor sedang di masak dengan santan dan ayam, level pedas: " + tingkatPedas);
    }
}