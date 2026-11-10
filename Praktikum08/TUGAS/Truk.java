package Praktikum08.TUGAS;

public class Truk extends Kendaraan {
    public double kapasitasMuatan; // dalam ton

    public Truk(String merk, int tahun, double kapasitasMuatan) {
        super(merk, tahun);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void menyalakan() {
        System.out.println("Memanaskan mesin diesel, truk siap berjalan");
    }

    // Asumsi: 1 liter solar = 5 km, harga Rp12.000/liter
    @Override
    public double hitungBiayaPerjalanan(double jarakKm) {
        return jarakKm / 5 * 12000;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas : " + this.kapasitasMuatan + " ton");
    }
}