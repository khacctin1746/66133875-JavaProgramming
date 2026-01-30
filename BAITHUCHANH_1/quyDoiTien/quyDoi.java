import java.util.Scanner;

public class quyDoi {
    private double usd;
    private double eur;
    private double vnd1;
    private double vnd2;

    Scanner sc = new Scanner(System.in);
    public void nhapDuLieu() {
        System.out.print("Vui long nhap usd: "); usd = sc.nextDouble();
        System.out.print("Vui long nhap eur: "); eur = sc.nextDouble();
    }

    public void quyDoiTien() {
        vnd1 = usd*23500;
        vnd2 = eur*27000;
    }

    public void xuatDuLieu() {
        System.out.println(usd + " usd doi thanh vnd la: " + vnd1);
        System.out.println(eur + " eur doi thanh vnd la: " + vnd2);
    }
}
