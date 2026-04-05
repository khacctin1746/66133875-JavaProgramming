import NganHang.TaiKhoanThanhToan;
import NganHang.TaiKhoanTietKiem;

public class Main {
    public static void main(String[] args) {
        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan("198527MBBANK", "NGUYEN VAN A", 1000000, 500000, 5500, "TRUYEN TRANH 052", 19500);
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem("198527MBBANK", "NGUYEN VAN B", 1000000, 6, 0.5, 4);
        System.out.println("TAI KHOAN THANH TOAN");
        taiKhoanThanhToan.hienThiThongTin();
        taiKhoanThanhToan.rutTien();
        taiKhoanThanhToan.thanhToanHoaDon();

        System.out.println("TAI KHOAN TIET KIEM");
        taiKhoanTietKiem.hienThiThongTin();
        System.out.println("Lai suat cua tai khoan: " + taiKhoanTietKiem.tinhLaiXuat());
        taiKhoanTietKiem.rutTien();
    }
}