package DaoTao;

import java.util.ArrayList;

public class HocVien extends NguoiDung{
    private ArrayList<String> danhSachKhoaHoc;
    private double diemSoTrungBinh;

    public HocVien(String id, String hoTen, String email, String password, String ngayDangKy, double diemSoTrungBinh) {
        super(id, hoTen, email, password, ngayDangKy);
        this.diemSoTrungBinh = diemSoTrungBinh;
        danhSachKhoaHoc = new ArrayList<>();
    }

    public void thamGiaKhoaHoc(String khoaHoc) {
        danhSachKhoaHoc.add(khoaHoc);
        System.out.println(hoTen + " da tham gia khoa hoc " + khoaHoc + "!");
    }

    public void nopBaiTap() {
        System.out.println(hoTen + " da nop bai tap!");
    }

    public void xemKetQuaHocTap() {
        System.out.println("Diem TB: " + diemSoTrungBinh);
    }
}
