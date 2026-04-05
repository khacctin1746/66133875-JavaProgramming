package CacHinh;

public class HinhTamGiac extends HinhHoc{
    private double canhA, canhB, canhC;

    public HinhTamGiac(String ten, String mauSac, double canhA, double canhB, double canhC) {
        super(ten, mauSac);
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public boolean kiemTraHopLe() {
        return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
    }

    @Override
    public double tinhChuVi() {
        if(!kiemTraHopLe()) {
            return 0;
        }
        return canhA + canhB + canhC;
    }

    @Override
    public double tinhDienTich() {
        if(!kiemTraHopLe()) {
            return 0;
        }
        double p = tinhChuVi()/2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }
}
