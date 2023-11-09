import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();

        if (N >= 3) {

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(" " + N);
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Masukkan nilai N (minimal 3)");
        }
        input.close();
    }
}
