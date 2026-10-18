import java.util.Scanner;

public class MultiplicationGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N:");
        int n = input.nextInt();

        for (int baris =1; baris <= n; baris++) {
            System.out.println();
            for (int kolom = 1; kolom <= n; kolom++) {
                System.out.printf("%4d", baris * kolom);
            }
        }
        input.close();
    }
}