package PTGiaoThong;

public class XeMay extends PhuongTien{
    private long dungTichXiLanh;
    private String loaiXe;
    private int soChoNgoi;

    public XeMay(String hangSanXuat, int namSanXuat, long giaBan, long dungTichXiLanh, String loaiXe, int soChoNgoi) {
        super(hangSanXuat, namSanXuat, giaBan);
        this.dungTichXiLanh = dungTichXiLanh;
        this.loaiXe = loaiXe;
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public long layVanTocToiDa() {
        return dungTichXiLanh;
    }

    @Override
    public int laySoChoNgoi() {
        return soChoNgoi;
    }
}
