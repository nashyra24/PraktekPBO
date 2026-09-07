package Praktikum02;

public class DragonMain {
    public static void main(String[] args) {
        // Instansiasi Objek 1 (Dragon 1)
        Dragon dragon1 = new Dragon();
        System.out.println("--- Status Awal Dragon 1 ---");
        dragon1.printStatus();
        
        System.out.println("\n--- Pergerakan Dragon 1 ---");
        dragon1.move(5); // Bergerak ke atas (default dir=1)
        dragon1.printStatus();
        
        dragon1.changeDirection(2); // Ubah arah ke Kanan
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println("\n==================================");

        // Instansiasi Objek 2 (Dragon 2)
        Dragon dragon2 = new Dragon(2, 4, 3); // Posisi awal (2,4) arah Bawah (3)
        System.out.println("--- Status Awal Dragon 2 ---");
        dragon2.printStatus();

        System.out.println("\n--- Pergerakan Dragon 2 ---");
        dragon2.move(2); // Bergerak ke bawah 2 langkah
        dragon2.printStatus();

        dragon2.changeDirection(4); // Ubah arah ke Kiri
        dragon2.move(4);
        dragon2.printStatus();
    }
}