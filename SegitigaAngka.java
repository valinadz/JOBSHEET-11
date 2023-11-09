import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();
        input.close();

        if (N < 3) {
            System.out.println("Nilai N tidak valid!");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
