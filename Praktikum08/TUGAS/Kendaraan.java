package Praktikum08.TUGAS;

public abstract class Kendaraan {
    public String merk;
    public int tahun;
    public double kecepatan;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
        this.kecepatan = 0;
    }

    public abstract void menyalakan();
    public abstract double hitungBiayaPerjalanan(double jarakKm);

    public void berhenti() {
        this.kecepatan = 0;
        System.out.println(this.merk + " berhenti");
    }

    public void cetakInfo() {
        System.out.println("Merk      : " + this.merk);
        System.out.println("Tahun     : " + this.tahun);
        System.out.println("Kecepatan : " + this.kecepatan + " km/jam");
    }
}