import packDH.DonHang;
import packDH.QuanLyDonHang;

import java.util.Scanner;

public class Main {
    public static QuanLyDonHang ql = new QuanLyDonHang();

    public static void themDH() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        String maDH;
        String tenKH;
        int soLuongSanPham;
        double tongTien;

        // them don hang
        System.out.println("+ THEM DON HANG");
        System.out.print("- Vui long nhap ma don hang: ");
        maDH = scanner.nextLine();
        System.out.print("- Vui long nhap ten khach hang: ");
        tenKH = scanner.nextLine();
        System.out.print("- Vui long nhap tong tien cua don hang: ");
        tongTien = scanner.nextDouble();
        ql.themDonHang(new DonHang(maDH,tenKH,tongTien));

        // mo ta san pham trong don hang
        System.out.println("- Vui long nhap so luong hang ma khach hang mua: ");
        soLuongSanPham = scanner1.nextInt();
        scanner1.nextLine();
        for(int i = 0; i < soLuongSanPham; i++) {
            String motaSP;
            System.out.println("> Vui long nhap mo ta san pham " + (i+1));
            motaSP = scanner1.nextLine();
            ql.themSanPhamVaoDon(maDH, motaSP);
        }
    }

    public static void inDon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("+ Vui long nhap ma don hang de kiem tra: ");
        String option = scanner.nextLine();
        ql.moTa(option);
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+ HE THONG DAT HANG");
        System.out.println("- 1. Them don hang");
        System.out.println("- 2. In ra don hang theo ma");
        System.out.print("= Vui long nhap (1 - 2): ");
        int option = scanner.nextInt();
        if(option == 1) {
            themDH();
            menu();
        } else if(option == 2) {
            inDon();
            menu();
        }
    }
    public static void main(String[] args) {
        // TEST SP1
        ql.themDonHang(new DonHang("FER174", "NGUYEN KHAC TIN", 128000));
        ql.themSanPhamVaoDon("FER174", "Tui nhua 100k");
        ql.themSanPhamVaoDon("FER174", "Monster Energy Ultra Zero 28k");

        //TEST SP2
        ql.themDonHang(new DonHang("FER175", "NGUYEN KHAC TIN", 999999));
        ql.themSanPhamVaoDon("FER175", "Tui nhua 998k");
        ql.themSanPhamVaoDon("FER175", "Monster Energy Ultra Mango 1k");
        //ql.moTa("FER174");

        menu();
    }
}