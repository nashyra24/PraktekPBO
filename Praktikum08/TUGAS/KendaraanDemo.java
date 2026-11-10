package Praktikum08.TUGAS;

public class KendaraanDemo {
    public static void main(String[] args) {
        // Kendaraan k = new Kendaraan("X", 2020);  // ERROR: Kendaraan is abstract

        Mobil mobil1 = new Mobil("Toyota Avanza", 2022, 4);
        System.out.println("=== MOBIL ===");
        mobil1.cetakInfo();
        mobil1.menyalakan();
        mobil1.kecepatan = 60;
        System.out.println("Biaya 120 km : Rp" + String.format("%.0f", mobil1.hitungBiayaPerjalanan(120)));
        mobil1.berhenti();

        Motor motor1 = new Motor("Honda Vario", 2023, "Matic");
        System.out.println("\n=== MOTOR ===");
        motor1.cetakInfo();
        motor1.menyalakan();
        motor1.kecepatan = 50;
        System.out.println("Biaya 120 km : Rp" + String.format("%.0f", motor1.hitungBiayaPerjalanan(120)));
        motor1.berhenti();

        Truk truk1 = new Truk("Hino Dutro", 2021, 8);
        System.out.println("\n=== TRUK ===");
        truk1.cetakInfo();
        truk1.menyalakan();
        truk1.kecepatan = 40;
        System.out.println("Biaya 120 km : Rp" + String.format("%.0f", truk1.hitungBiayaPerjalanan(120)));
        truk1.berhenti();
    }
}