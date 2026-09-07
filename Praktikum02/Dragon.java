package Praktikum02;

public class Dragon {
    int x;
    int y;
    int direction; // 1: atas, 2: kanan, 3: bawah, 4: kiri

    // Constructor default
    public Dragon() {
        this.x = 0;
        this.y = 0;
        this.direction = 1; // Default arah ke atas untuk mencegah nilai 0
    }

    // Constructor berparameter
    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        changeDirection(direction);
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        } else {
            System.out.println("Arah tidak valid! Arah harus bernilai 1 (Atas), 2 (Kanan), 3 (Bawah), atau 4 (Kiri).");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: // Atas
                y += steps;
                break;
            case 2: // Kanan
                x += steps;
                break;
            case 3: // Bawah
                y -= steps;
                break;
            case 4: // Kiri
                x -= steps;
                break;
            default:
                System.out.println("Arah belum ditentukan dengan benar!");
                break;
        }
    }

    public void printStatus() {
        String namaArah = "";
        switch (direction) {
            case 1: namaArah = "Atas"; break;
            case 2: namaArah = "Kanan"; break;
            case 3: namaArah = "Bawah"; break;
            case 4: namaArah = "Kiri"; break;
            default: namaArah = "Tidak Diketahui"; break;
        }
        System.out.println("Posisi Dragon -> X: " + x + ", Y: " + y + " | Arah: " + direction + " (" + namaArah + ")");
    }
}
