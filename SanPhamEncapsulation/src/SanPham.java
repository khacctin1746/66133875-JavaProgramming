public class SanPham {
    private String maSP;
    private String tenSP;
    private int gia;
    private int soLuong;
    private double thanhTien;

    //constructor default
    public SanPham() {
        this.maSP = "empty";
        this.tenSP = "empty";
        this.gia = 0;
        this.soLuong = 0;
    }

    //constructor
    public SanPham(String maSP, String tenSP, int gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    // Getter
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    //Setter
    public void setGia(int gia) {
        if(!(gia <= 0)) {
            this.gia = gia;
        } else {
            this.gia = 0;
        }
    }

    public void setMaSP(String maSP) {
        if(maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Ma san pham khong hop le");
        }
    }

    public void setTenSP(String tenSP) {
        if(tenSP != null && !tenSP.trim().isEmpty()) {
            this.tenSP = tenSP;
        } else {
            System.out.println("Ten pham khong hop le");
        }
    }

    public void setSoLuong(int soLuong) {
        if(!(soLuong <= 0)) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong hop le, so luong phai >= 0");
        }
    }

    public void tinhThanhTien() {
        this.thanhTien = gia*soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Thong Tin HD - Ma: " + this.maSP + " | Ten SP: " + this.tenSP + " | Gia: " + gia + " | So luong: " + soLuong + " | Thanh tien: " + thanhTien);
    }
}
