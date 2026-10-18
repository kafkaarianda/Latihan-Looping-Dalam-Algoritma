import java.util.Scanner;
public class RightTrianglePattern {
  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan N: ");
       int n = input.nextInt();

       for (int baris = 1; baris <= n; baris++) {
            for (int j = 1; j <= baris; j++) {
                System.out.print("*");
            }
           System.out.println(); 
        }
        input.close();
    }
}