package Jobsheet08;

public class Main {
    public static void main(String[] args) {
        // Instansiasi Objek TV
        TV tv = new TV();
        tv.merk = "Samsung";
        tv.harga = 3500000;
        tv.warna = "Hitam";
        tv.jenisLayar = "LED";
        tv.volume = 15;

        System.out.println("=== INFORMASI TV ===");
        tv.getInfo();
        System.out.println("Jenis Layar : " + tv.jenisLayar);
        System.out.println("Volume      : " + tv.volume);

        System.out.println();

        // Instansiasi Objek Kulkas
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.harga = 2800000;
        kulkas.warna = "Silver";
        kulkas.jumlahPintu = 2;

        System.out.println("=== INFORMASI KULKAS ===");
        kulkas.getInfo();
        System.out.println("Jumlah Pintu: " + kulkas.jumlahPintu);
    }
}