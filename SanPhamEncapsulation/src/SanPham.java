public class SanPham {
    private int maSP;
    private String tenSP;
    private int gia;
    private int soLuong;

    //constructor default
    public SanPham() {
        this.maSP = 0;
        this.tenSP = "empty";
        this.gia = 0;
        this.soLuong = 0;
    }

    //constructor
    public SanPham(int maSP, String tenSP, int gia, int soLuong) {
        this.maSP = maSP;
    }

    // Getter
    public int getMaSP() {
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
}
