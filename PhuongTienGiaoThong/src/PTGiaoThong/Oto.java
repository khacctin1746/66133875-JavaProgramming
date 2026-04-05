package PTGiaoThong;

public class Oto extends PhuongTien {
    private int soCho;
    private String kieuDongCo;
    private long cc;

    public Oto(String hangSanXuat, int namSanXuat, long giaBan, int soCho, String kieuDongCo, long cc) {
        super(hangSanXuat, namSanXuat, giaBan);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
        this.cc = cc;
    }

    public String getKieuDongCo() {
        return this.kieuDongCo;
    }

    @Override
    public long layVanTocToiDa() {
        return cc;
    }

    @Override
    public int laySoChoNgoi() {
        return soCho;
    }
}
