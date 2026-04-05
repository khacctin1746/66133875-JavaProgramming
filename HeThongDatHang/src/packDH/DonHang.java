package packDH;

import java.util.List;

public class DonHang {
    private String maDH;
    private String tenKH;
    private List<String> danhSachSanPham;
    private double tongTien;

    public DonHang() {
        this.maDH = " ";
        this.tenKH = " ";
        this.tongTien = 0;
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


}
