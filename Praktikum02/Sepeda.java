package Praktikum02;

public class Sepeda {
    float kecepatan;
    int gear;

    public Sepeda(float tambahKecepatan,int newGear) {
        kecepatan = newGear;
        gear = newGear;
    }

     public void tambahKecepatan(float increment) {
        kecepatan += increment;
     }

    public void kurangiKecepatan(float decrement) {
        kecepatan -= decrement;
    }

    public void cetakInfo() {
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Gear: " + gear);
        System.out.println("================================");
    }
}
