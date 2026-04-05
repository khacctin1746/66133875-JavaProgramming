package NganHang;

import java.util.Scanner;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    protected long soDu;

    Scanner scanner = new Scanner(System.in);

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, long soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public void guiTien() {
        System.out.print("Ban muon gui bao nhieu tien? Vui long nhap: ");
        soDu += scanner.nextLong();
    }

    public void rutTien() {
        System.out.println("Ban muon rut bao nhieu tien? Vui long nhap: ");
        long check = scanner.nextLong();
        if(soDu >= check) {
            soDu -= check;
            System.out.println("Rut " + check + " thanh cong! So du con lai: " + soDu);
        } else {
            System.out.println("Ban khong du tien de rut" + check);
        }
    }

    public void hienThiThongTin() {
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("Chu tai khoan: " + tenChuTaiKhoan);
        System.out.println("So du: " + soDu);
    }
}
