package NhanVat;

public class PhapSu extends NhanVat {
    private double mana;
    private boolean phepThuat;

    public PhapSu(String ten, int capDo, int mau, int sucManh, double mana, boolean phepThuat) {
        super(ten, capDo, mau, sucManh);
        this.mana = mana;
        this.phepThuat = phepThuat;
    }

    @Override
    public double tanCong() {
        return this.mana-20;
    }

    public double hoiMana() {
        return mana+20;
    }

    public boolean suDungPhepThuat() {
        return phepThuat = true;
    }
}
