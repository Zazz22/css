import java.util.Scanner;

public class RataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.println("Masukkan 5 angka:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Angka ke-" + i + ": ");
            total += input.nextDouble();
        }

        double rataRata = total / 5;
        System.out.println("Nilai rata-rata: " + rataRata);

        input.close();
    }
}
