package UTS;

// Kelas Induk (Parent Class)
public class Makanan {
    public int garam;
    public int gula;
    public int air;

    // Tanpa parameter
    public void masak() {
        System.out.println("Makanan sedang di masak");
    }

    // Overloading ada parameter
    public void masak(int porsi) {
        System.out.println("Makanan sedang di masak sebanyak " + porsi + " porsi");
    }
}