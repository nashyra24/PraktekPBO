package Jobsheet08.TUGAS;

public class MainTugas {
    public static void main(String[] args) {
        Sendable email = new Email("nashyra@email.com", "dosen@polinema.ac.id", "Tugas PBO Interface");
        System.out.println("=== PENGUJIAN EMAIL ===");
        email.kirim("Mohon izin mengumpulkan tugas interface saya.");
        email.tampilkanStatus();

        System.out.println();

        Sendable whatsapp = new WhatsApp("Nashyra", "081234567890", "Nabil");
        System.out.println("=== PENGUJIAN WHATSAPP ===");
        whatsapp.kirim("Jangan lupa kerjain tugas PBO ya");
        whatsapp.tampilkanStatus();
    }
}