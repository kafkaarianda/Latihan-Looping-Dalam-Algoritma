import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N (>= 0): ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Faktorial hanya untuk bilangan nonnegatif");
        } else {
            long hasil = 1;
            for (int i = 1; i <= n; i++) {
                hasil = hasil * i;
            }
            System.out.println(n + "! = " + hasil);
        }
        input.close();
    }
}