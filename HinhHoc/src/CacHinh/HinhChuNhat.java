package CacHinh;
public class HinhChuNhat extends HinhHoc {
    private String hinhChuNhat;
    private String mauHong;

    public HinhHoc(String ten, String mausac, String mauHong, String hinhChuNhat) {
        super(ten, mausac);
        this.hinhChuNhat = hinhChuNhat;
        this.mauHong = mauHong;
    }
}
