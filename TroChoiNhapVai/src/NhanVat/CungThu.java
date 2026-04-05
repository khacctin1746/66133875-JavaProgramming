package NhanVat;

public class CungThu extends NhanVat{
    private double tamBan, soTen;

    public CungThu(String ten, int capDo, int mau, int sucManh, double tamBan, double soTen) {
        super(ten, capDo, mau, sucManh);
        this.tamBan = tamBan;
        this.soTen = soTen;
    }

    public void banTen() {
        System.out.println("Da ban ten");
        soTen-=1;
    }

    @Override
    public double tanCong() {
        if(tamBan > 1) {
            return mau-30;
        }
        return mau-20;
    }
}
