package DaoTao;

public class QuanTriVien extends NguoiDung {
    private String quyenHan;

    public QuanTriVien(String id, String hoTen, String email, String password, String ngayDangKy, String quyenHan) {
        super(id, hoTen, email, password, ngayDangKy);
        this.quyenHan = quyenHan;
    }

    public void duyetKhoaHoc() {
        if(quyenHan.equals("ADMIN")) {
            System.out.println(hoTen + " Da duyet khoa hoc!");
        } else {
            System.out.println("Ban khong co quyen de lam dieu nay!");
        }
    }

    public void khoaTaiKhoan() {
        if(quyenHan.equals("ADMIN")) {
            System.out.println(hoTen + " Da khoa tai khoan");
        } else {
            System.out.println("Ban khong co quyen de lam dieu nay!");
        }
    }

    public void xemBaoCao() {
        if(quyenHan.equals("ADMIN")) {
            System.out.println(hoTen + " Dang xem bao cao!");
        } else {
            System.out.println("Ban khong co quyen de lam dieu nay!");
        }
    }
}
