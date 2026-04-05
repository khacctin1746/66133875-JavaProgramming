package NganHang;

import java.util.Scanner;

public class TaiKhoanTietKiem extends TaiKhoan {
    private int kyHan, soThang;
    private double laiXuat;

    Scanner scanner = new Scanner(System.in);

    public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan, long soDu, int kyHan, double laiXuat, int soThang) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.kyHan = kyHan;
        this.laiXuat = laiXuat;
        this.soThang = soThang;
    }

    // tinh tien lai
    public long tinhLaiXuat() {
        long tongTien = (long) (soDu * Math.pow(1 + laiXuat/12, kyHan));
        long laiLa = tongTien - soDu;
        return laiLa;
    }

    @Override
    public void rutTien() {
        if(soThang <= kyHan) {
            int checkThang = kyHan - soThang;
            System.out.println("Bạn không thể rút tiền trước kì hạn, vui lòng chờ " + checkThang + " tháng sau để rút!");
        } else {
            System.out.print("Ban muon rut bao nhieu tien? Vui long nhap: ");
            long checkSoDu = scanner.nextLong();
            if(soDu >= checkSoDu) {
                soDu -= checkSoDu;
                System.out.println("Rut " + checkSoDu + " thanh cong! So du con lai: " + soDu);
            } else {
                System.out.println("Ban khong du tien de rut" + checkSoDu);
            }
        }
    }
}
