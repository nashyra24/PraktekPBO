package Praktikum08.TUGAS;

public class Mobil extends Kendaraan {
    public int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void menyalakan() {
        System.out.println("Memutar kunci kontak, mesin mobil menyala");
    }

    // Asumsi: 1 liter bensin = 12 km, harga Rp10.000/liter
    @Override
    public double hitungBiayaPerjalanan(double jarakKm) {
        return jarakKm / 12 * 10000;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jml Pintu : " + this.jumlahPintu);
    }
}