package thigk2.nguyenkhactin;

import thigk2.nguyenkhactin.packSV.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
    public static void main(String[] args) {
        ds.add(new SinhVien("66133875", "NGUYEN KHAC TIN", 2006, "Nam"));
        ds.add(new SinhVien("66133877", "NGUYEN DIEU LINH", 2006, "Nu"));
        ds.add(new SinhVien("66143879", "NGUYEN QUANG HUY", 2006, "Nam"));
        // In ra danh sách sinh viên hard code
        InThongTinSinhVien();
        //Thêm sinh viên mới
        ThemMoiSV();
        //In ra lại thông tin sinh viên
        InThongTinSinhVien();
        // In ra thông tin sinh viên có tuổi > 20
        LocSinhVien();
    }

    // hàm xử lí thêm mới sinh viên
    public static void ThemMoiSV() {
        SinhVien sv = new SinhVien();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap ma so sinh vien: ");
        sv.setMaSV(scanner.nextLine());
        System.out.print("Vui long nhap ten sinh vien: ");
        sv.setHoTen(scanner.nextLine());
        System.out.print("Vui long nhap nam sinh sinh vien: ");
        sv.setNamSinh(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Vui long nhap gioi tinh sinh vien: ");
        sv.setGioiTinh(scanner.nextLine());
        ds.add(sv);
    }

    // hàm xử lí in ra thông tin sinh viên
    public static void InThongTinSinhVien() {
        for(SinhVien sv : ds) {
            System.out.println("- Mã sinh viên: " + sv.getMaSV());
            System.out.println("- Họ tên sinh viên:" + sv.getHoTen());
            System.out.println("- Năm sinh sinh viên: " + sv.getNamSinh());
            System.out.println("- Giới tính sinh viên: " + sv.getGioiTinh());
        }
    }
    // hàm xử lí lọc tuổi > 20 của sinh viên và in ra
    public static void LocSinhVien() {
        for(SinhVien sv : ds) {
            if(sv.getTuoi() > 20) {
                System.out.println("- Mã sinh viên: " + sv.getMaSV());
                System.out.println("- Họ tên sinh viên:" + sv.getHoTen());
                System.out.println("- Năm sinh sinh viên: " + sv.getNamSinh());
                System.out.println("- Giới tính sinh viên: " + sv.getGioiTinh());
            }
        }
    }
}