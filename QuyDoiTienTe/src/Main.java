import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    final int tusd = 23500;
    final int tuer = 27000;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Vui long nhap usd can doi: ");
    int usd = scanner.nextInt();
    System.out.print("Vui long nhap uer can doi: ");
    int eur = scanner.nextInt();

    System.out.println(usd + "USD -> VND = " + usd*tusd + " | " + eur + " UER -> VND = " + eur*tuer);
  }
}