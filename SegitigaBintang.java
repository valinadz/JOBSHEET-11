import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();
        input.close();

        if (N < 5) {
            System.out.println("Nilai N tidak valid!");
            return;
        }

        for(int i = N; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}