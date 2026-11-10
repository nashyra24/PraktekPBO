package Jobsheet08.TUGAS;

public class WhatsApp implements Sendable {
    private String pengirim;
    private String nomorHp;
    private String namaPenerima;

    public WhatsApp(String pengirim, String nomorHp, String namaPenerima) {
        this.pengirim = pengirim;
        this.nomorHp = nomorHp;
        this.namaPenerima = namaPenerima;
    }

    @Override
    public void kirim(String pesan) {
        System.out.println("Mengirim WhatsApp ke " + namaPenerima + " (" + nomorHp + ")...");
        System.out.println("Pesan  : " + pesan);
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("Status : Pesan WhatsApp terkirim ke " + namaPenerima);
    }
}