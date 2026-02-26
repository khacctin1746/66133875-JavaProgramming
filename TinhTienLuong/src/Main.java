import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap luong theo gio: ");
        int luong = scanner.nextInt();
        System.out.print("Vui long nhap so gio lam: ");
        int gio = scanner.nextInt();

        System.out.println("Tong luong cua nguoi nay la: " + luong*gio);
    }
}