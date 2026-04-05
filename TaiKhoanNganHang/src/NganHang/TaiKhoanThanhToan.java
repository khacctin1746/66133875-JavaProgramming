package NganHang;

import java.util.Scanner;

public class TaiKhoanThanhToan extends TaiKhoan {
    private long hanMucRut, phiGiaoDich;
    private String tenHoaDon;
    private long giaHoaDon;

    Scanner scanner = new Scanner(System.in);

    public TaiKhoanThanhToan(String soTaiKhoan, String tenChuTaiKhoan, long soDu, long hanMucRut, long phiGiaoDich, String tenHoaDon, long giaHoaDon) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.hanMucRut = hanMucRut;
        this.phiGiaoDich = phiGiaoDich;
        this.tenHoaDon = tenHoaDon;
        this.giaHoaDon = giaHoaDon;
    }

    @Override
    public void rutTien() {
        System.out.println("Ban muon rut bao nhieu tien? Vui long nhap: ");
        long check = scanner.nextLong();
        if(soDu >= (check + phiGiaoDich) && check <= hanMucRut) {
            soDu -= check + phiGiaoDich;
            System.out.println("Rut " + check + " thanh cong! So du con lai: " + soDu);
        } else if(check >= hanMucRut) {
            System.out.println("Ban khong the rut tien vuot qua han muc: " + hanMucRut);
        } else {
            System.out.println("Ban khong du tien de rut " + check);
        }
    }

    public void thanhToanHoaDon() {
        System.out.println("Ban can thanh toan hoa don: " + tenHoaDon + " | Gia hoa don " + giaHoaDon);
        if(!(soDu < giaHoaDon)) {
            soDu -= giaHoaDon;
            System.out.println("Thanh cong! Ban da thanh toan hoa don: "  + tenHoaDon + " | Gia hoa don: " + giaHoaDon + " | So du con lai: " + soDu);
        } else {
            System.out.println("So du ban khong du, vui long nap them! ");
        }
    }
}
