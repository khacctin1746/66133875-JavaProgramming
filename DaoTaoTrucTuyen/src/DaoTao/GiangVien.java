package DaoTao;

import java.util.ArrayList;

public class GiangVien extends NguoiDung {
    private String chuyenMon;
    private ArrayList<String> danhSachKhoaHocGiangDay;

    public GiangVien(String id, String hoTen, String email, String password, String ngayDangKy, String chuyenMon) {
        super(id, hoTen, email, password, ngayDangKy);
        this.chuyenMon = chuyenMon;
        danhSachKhoaHocGiangDay = new ArrayList<>();
    }

    public void taoKhoaHoc(String khoaHoc) {
        danhSachKhoaHocGiangDay.add(khoaHoc);
        System.out.println(hoTen + " Da tao khoa hoc: " + khoaHoc);
    }

    public void chamBai() {
        System.out.println(hoTen + " da cham bai!");
    }

    public void traoDoiVoiHocVien() {
        System.out.println(hoTen + " dang trao doi voi hoc vien");
    }
}
