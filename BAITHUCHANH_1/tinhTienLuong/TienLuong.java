import java.util.Scanner;

public class TienLuong {
    private int sogio;
    private double tongTienLuong;

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin() {
        System.out.print("Vui long nhap so gio lam: "); sogio = sc.nextInt();
    }

    public void tinhTienLuong() {
        if(sogio > 40) {
            tongTienLuong = 100000*sogio*1.5;
        } else {
            tongTienLuong = 100000*sogio;
        }
    }

    public void xuatTienLuong() {
        System.out.println("Tien luong cua nv la: " + tongTienLuong);
    }
}
