import DaoTao.GiangVien;
import DaoTao.HocVien;
import DaoTao.QuanTriVien;

public class Main {
    public static void main(String[] args) {
        HocVien hocVien = new HocVien("166013", "NGUYEN VAN A", "166013@Gmail.com", "dmwibu", "17/4/2025", 6.5);
        GiangVien giangVien = new GiangVien("166014", "NGUYEN VAN B", "166017@Gmail.com", "javaisthebest", "18/4/1999","JAVA");
        QuanTriVien quanTriVien = new QuanTriVien("ADMIN", "NGUYEN VAN C", "admin@Gmail.com", "ntuisthebest", "1/8/1959", "ADMIN");

        //HOC VIEN
        System.out.println("LOP HOC VIEN");
        hocVien.dangNhap();
        hocVien.xemThongTin();
        hocVien.thamGiaKhoaHoc("JAVA");

        //GIANGVIEN
        System.out.println("LOP GIANG VIEN");
        giangVien.dangNhap();
        giangVien.xemThongTin();
        giangVien.taoKhoaHoc("JAVA");
        giangVien.chamBai();
        giangVien.traoDoiVoiHocVien();

        //QUAN TRI VIEN
        System.out.println("LOP QUAN TRI VIEN");
        quanTriVien.dangNhap();
        quanTriVien.xemThongTin();
        quanTriVien.duyetKhoaHoc();
        quanTriVien.khoaTaiKhoan();
        quanTriVien.xemBaoCao();
    }
}