package packSP;

public class SanPham {
    private String maSp;
    private String tenSp;
    private double gia;
    private int soLuong;

    public SanPham() {
        this.maSp = " ";
        this.tenSp = " ";
        this.gia = 0;
        this.soLuong = 0;
    }

    public SanPham(String maSp, String tenSp, double gia, int soLuong) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
