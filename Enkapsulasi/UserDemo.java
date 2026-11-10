package Enkapsulasi;

public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User("annisa.nadya", "annisa.nadya@gmail.com");
        user1.displayInfo();
        System.out.println();

        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 1234 CD");
        motor1.setKecepatan(50);
        motor1.displayInfo();
    }
    
}
