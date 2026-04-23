package thigk2.nguyenkhactin.packSV;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;

    // khai bao constructor co tham so
    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.namSinh = 0;
        this.gioiTinh = "";
    }

    // khai bao constructor khong co tham so
    public SinhVien(String maSV, String hoTen, int namSinh, String gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    //getter
    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public int getTuoi() {
        return 2026 - namSinh;
    }

    //setter
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
