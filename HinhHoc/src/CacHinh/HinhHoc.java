package CacHinh;

public class HinhHoc {
    protected String ten;
    protected String mausac;

    //constructor
    public HinhHoc(String ten, String mausac) {
        this.ten = ten;
        this.mausac = mausac;
    }

    public double tinhDienTich() {
        return 0;
    }

    public double tinhChuVi() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Ten: " + this.ten);
        System.out.println("Mau sac: " + this.mausac);
    }
 }
