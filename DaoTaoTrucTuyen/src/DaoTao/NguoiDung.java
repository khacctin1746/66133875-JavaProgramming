package DaoTao;

import java.util.Scanner;

public class NguoiDung {
    private String id, email, ngayDangKy, password;
    protected String hoTen;

    Scanner scanner = new Scanner(System.in);

    public NguoiDung(String id, String hoTen, String email, String password, String ngayDangKy) {
        this.id = id;
        this.hoTen = hoTen;
        this.email = email;
        this.password = password;
        this.ngayDangKy = ngayDangKy;
    }

    public void dangNhap() {
        System.out.println("Vui long nhap email: ");
        String emailCheck = scanner.nextLine();
        if(emailCheck.equals(email)) {
            System.out.println("Vui long nhap mat khau: ");
            String passwordCheck = scanner.nextLine();
            if(passwordCheck.equals(password)) {
                System.out.println("Dang nhap thanh cong!");
            } else {
                System.out.println("Sai mat khau!");
            }
        } else {
            System.out.println("Email " + emailCheck + " khong ton tai trong he thong");
        }
    }

    public void xemThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Ngay dang ki: " + ngayDangKy);
    }
}
