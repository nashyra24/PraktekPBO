package UTS;

// Kelas Utama buat run program
public class Main {
    public static void main(String[] args) {
        // Inheritance & Overriding
        Sop sopKu = new Sop();
        sopKu.masak(); 
        
        Opor oporKu = new Opor();
        oporKu.masak(); 

        System.out.println("-----------------------------------");

        // Overloading
        sopKu.masak(3);              
        sopKu.masak(5, 2);           
        oporKu.masak("Pedas Sedang"); 
    }
}