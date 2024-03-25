import java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan NIS :");
        String nis = scanner.nextLine();
        System.out.println("Masukkan Nama :");
        String nama = scanner.nextLine();
        System.out.println("Masukkan Gender :");
        String gender = scanner.nextLine();
        System.out.println("Masukkan Agama :");
        String agama = scanner.nextLine();

        scanner.close();

        System.out.println("\n=== BIODATA ANDA ===");
        System.out.println("NIS = " + nis);
        System.out.println("Nama = " + nama);
        System.out.println("Gender = " + gender);
        System.out.println("Agama = " + agama);

    }
}