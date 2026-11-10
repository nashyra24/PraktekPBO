package UTS;

// Child Class - Inheritance
public class Sop extends Makanan {
    public int sosis;
    public int sayur;

    // Overriding
    @Override
    public void masak() {
        System.out.println("Memasak Sop dengan sosis dan sayur");
    }

    // Overloading
    public void masak(int sosis, int sayur) {
        System.out.println("Memasak Sop dengan " + sosis + " sosis dan " + sayur + " sayur");
    }
}