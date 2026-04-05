package NhanVat;

public class NhanVat {
    private String ten;
    private int capDo;
    protected int mau, sucManh;

    public NhanVat(String ten, int capDo, int mau, int sucManh) {
        this.ten = ten;
        this.capDo = capDo;
        this.mau = mau;
        this.sucManh = sucManh;
    }

    public double tanCong() {
        return sucManh;
    }

    public double nhanSatThuong() {
        return mau;
    }

    public void chet() {

    }

 }
