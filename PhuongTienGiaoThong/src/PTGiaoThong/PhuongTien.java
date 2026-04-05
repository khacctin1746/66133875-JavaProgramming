package PTGiaoThong;

public class PhuongTien {

    private String hangSanXuat;
    private int namSanXuat;
    private long giaBan;

    public PhuongTien(String hangSanXuat, int namSanXuat, long giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
    }

    public long layVanTocToiDa() {
        return 0;
    }

    public int laySoChoNgoi() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Hang san xuat: " + hangSanXuat);
        System.out.println("Nam san xuat: " + namSanXuat);
        System.out.println("Gia ban: " + giaBan);
    }
}
