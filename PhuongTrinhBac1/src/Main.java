import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap a: ");
        float a = scanner.nextFloat();
        System.out.print("Vui long nhap b: ");
        int b = scanner.nextInt();

        System.out.print("Ket qua la: " + -b/a);
    }
}