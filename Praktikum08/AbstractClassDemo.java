package Praktikum08;

public class AbstractClassDemo {
    public static void main(String[] args) {
        //Hewan hewan1 = new Hewan(10, "Rumput", "Savana");
       // hewan1.cetakInfo();
        //hewan1.bergerak();
        //hewan1.bernapas();
        // ERROR: Hewan abstract, tidak bisa diinstansiasi
    

    System.out.println("=== LEBAH ===");
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

    System.out.println("\n=== ULAR ===");
        Ular ular1 = new Ular(true, 5, "Tikus", "Hutan");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}