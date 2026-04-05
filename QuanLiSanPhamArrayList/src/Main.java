import packSP.QuanLySanPham;
import packSP.SanPham;

import java.util.Scanner;

public class Main {

    private static int option;
    static QuanLySanPham ql = new QuanLySanPham();

    public static void xoaSanPham() {
        Scanner scanner = new Scanner(System.in);
        String maSP;
        System.out.print("+ Vui long nhap ma san pham de xoa: ");
        maSP = scanner.nextLine();
        ql.xoaSP(maSP);
        menu();
    }

    public static void sortSanPham() {
        ql.sortSP();
        ql.hienThiFull();
        menu();
    }

    public static void timSanPham() {
        Scanner scanner = new Scanner(System.in);
        String tenSP;
        System.out.print("+ Vui long nhap ten san pham can tim: "); tenSP = scanner.nextLine();
        ql.timSP(tenSP);
        menu();
    }

    public static void tongKho() {
        ql.tongKho();
        menu();
    }

    public static void checkHang() {
        ql.lietKe();
        menu();
    }

    public static void themSanPham() {
        Scanner scanner = new Scanner(System.in);
        String maSP;
        String tenSP;
        double gia;
        int soLuong;

        System.out.println("+ VUI LONG NHAP TT");
        System.out.print("- Nhap ma san pham: "); maSP = scanner.nextLine();
        System.out.print("- Nhap ten san pham: "); tenSP = scanner.nextLine();
        System.out.print("- Nhap gia san pham: "); gia = scanner.nextDouble();
        System.out.print("- Nhap so luong san pham: "); soLuong = scanner.nextInt();
        ql.themSP(new SanPham(maSP,tenSP,gia,soLuong));
        menu();
    }
    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+ QUAN LI SAN PHAM");
        System.out.println("- 1. Them san pham");
        System.out.println("- 2. Tim san pham (theo ten)");
        System.out.println("- 3. Xoa san pham (theo ma)");
        System.out.println("- 4. Sọt san pham (theo gia)");
        System.out.println("- 5. Tinh tong kho (theo gia/so luong)");
        System.out.println("- 6. Tim san pham chay hang");
        System.out.println("- 7. Hien thi toan bo san pham");
        System.out.print("= Vui long nhap (1 - 7): ");
        option = scanner.nextInt();
        if(option == 1) {
            themSanPham();
        } else if(option == 2) {
            timSanPham();
        } else if(option == 3) {
            xoaSanPham();
        } else if(option == 4) {
            sortSanPham();
        } else if(option == 5) {
            tongKho();
        } else if(option == 6) {
            checkHang();
        } else if(option == 7) {
            ql.hienThiFull();
            menu();
        } else {
            System.out.println("+ Nhap gi vay bro? Nhap lai (1 - 7)");
            menu();
        }
    }
    public static void main(String[] args) {
        ql.themSP(new SanPham("FER174", "KHO MEO", 20000, 12));
        ql.themSP(new SanPham("FER175", "GIA CAY", 25000, 2));
        ql.themSP(new SanPham("FER176", "KHO BO", 19000, 1));
        menu();
    }
}