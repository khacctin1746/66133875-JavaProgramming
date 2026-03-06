public class ThuVien {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private boolean trangThai;

    //constructor default
    public ThuVien() {
        this.maSach = "empty";
        this.tenSach = "empty";
        this.tacGia = "empty";
        this.namXuatBan = 0;
        this.trangThai = true;
    }

    //constructor
    public ThuVien(String maSach, String tenSach, String tacGia, int namXuatBan, Boolean trangThai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.setNamXuatBan(namXuatBan); // validation
        this.trangThai= trangThai;
    }

    //getter
    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    //setter
    public void setMaSach(String maSach) {
        if(maSach != null && !maSach.trim().isEmpty()) {
            this.maSach = maSach;
        } else {
            System.out.println("Ma sach khong hop le");
        }
    }

    public void setTenSach(String tenSach) {
        if(tenSach != null && !tenSach.trim().isEmpty()) {
            this.tenSach = tenSach;
        } else {
            System.out.println("Ten sach khong hop le");
        }
    }

    public void setTacGia(String tacGia) {
        if(tacGia != null && !tacGia.trim().isEmpty()) {
            this.tacGia = tacGia;
        } else {
            System.out.println("Ten tac gia khong hop le");
        }
    }

    public void setNamXuatBan(int namXuatBan) {
        if(!(namXuatBan <= 0)) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le");
        }
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void muonSach() {
        if(trangThai == true) {
            this.trangThai = false;
        } else {
            System.out.println("Sach nay da duoc muon, vui long quay lai sau");
        }
    }

    public void traSach() {
        this.trangThai = true;
    }

    public boolean kiemTraSachCu() {
        if(namXuatBan < 2000) {
            return true;
        }
        return false;
    }
}
