package NhanVat;

public class ChienBinh extends NhanVat {
    private int giap;
    private String vuKhi;

    public ChienBinh(String ten, int capDo, int mau, int sucManh, int giap, String vuKhi) {
        super(ten, capDo, mau, sucManh);
        this.giap = giap;
        this.vuKhi = vuKhi;
    }

    @Override
    public double tanCong() {
        return sucManh*1.5;
    }

    @Override
    public double nhanSatThuong() {
        return mau-20;
    }
}
