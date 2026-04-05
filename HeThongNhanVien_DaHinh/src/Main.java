import QLNhanVien.NhanVien;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhap(2);
        nhanVien.xuat();
        System.out.println("+ Tong luong: " + nhanVien.tinhTongLuong());
        nhanVien.hienThiNhanVienLuongCaoNhat();
    }
}