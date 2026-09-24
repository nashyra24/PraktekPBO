public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Data Peminjam
        Peminjam p1 = new Peminjam("P001", "Andi Wijaya");

        // 2. Inisialisasi Data Barang
        Barang b1 = new Barang("BRG01", "Proyektor EPSON", 3);
        Barang b2 = new Barang("BRG02", "Kabel HDMI 5m", 5);
        Barang b3 = new Barang("BRG03", "Pointer Presentasi", 1);

        // 3. Buat Transaksi
        TransaksiPeminjaman trx = new TransaksiPeminjaman("TRX-2026-001", "2026-09-20", p1);

        // 4. Proses Peminjaman
        trx.tambahBarang(b1, 1);
        trx.tambahBarang(b2, 2);
        trx.tambahBarang(b3, 2); // Contoh gagal karena stok hanya 1

        // 5. Cetak Hasil
        trx.cetakStruk();
    }
}