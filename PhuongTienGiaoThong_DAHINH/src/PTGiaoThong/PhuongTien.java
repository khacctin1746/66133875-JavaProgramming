package PTGiaoThong;

public class PhuongTien {
    private String hangSanXuat;
    private int namSanXuat;
    private long giaBan;

    public PhuongTien() {
        this.hangSanXuat = "";
        this.namSanXuat = 0;
        this.giaBan = 0;
    }

    public PhuongTien(String hangSanXuat, int namSanXuat, long giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
    }

    // getter
    public String getHangSanXuat() {
        return this.hangSanXuat;
    }

    public int getNamSanXuat() {
        return this.namSanXuat;
    }

    public long getGiaBan() {
        return this.giaBan;
    }

    // setter
    public void setHangSanXuat(String hangSanXuat) {
        if(!(hangSanXuat.trim().isEmpty())) {
            this.hangSanXuat = hangSanXuat;
        }
    }

    public void setNamSanXuat(int namSanXuat) {
        if(!(namSanXuat > 0)) {
            this.namSanXuat = namSanXuat;
        }
    }

    public void setGiaBan(long giaBan) {
        if(!(giaBan > 0)) {
            this.giaBan = giaBan;
        }
    }


    // phuong thuc khac
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