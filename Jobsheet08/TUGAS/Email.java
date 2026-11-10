package Jobsheet08.TUGAS;

public class Email implements Sendable {
    private String pengirim;
    private String emailTujuan;
    private String subjek;

    public Email(String pengirim, String emailTujuan, String subjek) {
        this.pengirim = pengirim;
        this.emailTujuan = emailTujuan;
        this.subjek = subjek;
    }

    @Override
    public void kirim(String pesan) {
        System.out.println("Mengirim Email ke " + emailTujuan + "...");
        System.out.println("Subjek : " + subjek);
        System.out.println("Pesan  : " + pesan);
    }

    @Override
    public void tampilkanStatus() {
        System.out.println("Status : Email berhasil dikirim dari " + pengirim);
    }
}