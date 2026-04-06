package packDH;

import java.util.ArrayList;
import java.util.List;

public class DonHang {
    private String maDH;
    private String tenKH;
    private ArrayList<String> danhSachSanPham;
    private double tongTien;

    public DonHang() {
        this.maDH = " ";
        this.tenKH = " ";
        this.tongTien = 0;
        danhSachSanPham = new ArrayList<>();
    }

    public DonHang(String maDH, String tenKH, double tongTien) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.tongTien = tongTien;
        danhSachSanPham = new ArrayList<>();
    }

    public String getMaDH() {
        return maDH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void themSanPham(String sp) {
        danhSachSanPham.add(sp);
    }

    public ArrayList<String> getDanhSachSanPham() {
        return danhSachSanPham;
    }
}
