import CacHinh.HinhChuNhat;
import CacHinh.HinhTamGiac;
import CacHinh.HinhTron;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat("HCN", "Xanh La", 5, 3);
        HinhTron hinhTron = new HinhTron("HT", "Do", 2.5);
        HinhTamGiac  hinhTamGiac = new HinhTamGiac("HTG", "Hong", 3, 4, 5);

        System.out.println("THONG TIN HINH CHU NHAT");
        hinhChuNhat.hienThiThongTin();
        System.out.println("Dien tich: " + hinhChuNhat.tinhDienTich());
        System.out.println("Chu vi: " + hinhChuNhat.tinhChuVi());

        System.out.println("THONG TIN HINH TRON");
        hinhTron.hienThiThongTin();
        System.out.println("Dien tich: " + hinhTron.tinhDienTich());
        System.out.println("Chu vi: " +  hinhTron.tinhChuVi());

        System.out.println("THONG TIN HINH TAM GIAC");
        hinhTamGiac.hienThiThongTin();
        System.out.println("Dien tich: " + hinhTamGiac.tinhDienTich());
        System.out.println("Chu vi: " + hinhTamGiac.tinhChuVi());
    }
}