package Praktikum08.TUGAS;

public class Motor extends Kendaraan {
    public String jenis;

    public Motor(String merk, int tahun, String jenis) {
        super(merk, tahun);
        this.jenis = jenis;
    }

    @Override
    public void menyalakan() {
        System.out.println("Menekan tombol starter, mesin motor menyala");
    }

    // Asumsi: 1 liter bensin = 40 km, harga Rp10.000/liter
    @Override
    public double hitungBiayaPerjalanan(double jarakKm) {
        return jarakKm / 40 * 10000;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis     : " + this.jenis);
    }
}