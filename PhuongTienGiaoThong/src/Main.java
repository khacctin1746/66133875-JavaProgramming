import PTGiaoThong.Oto;
import PTGiaoThong.XeMay;

public class Main {
    public static void main(String[] args) {
        XeMay xeMay = new XeMay("Honda", 2025, 152690000, 329, "SH350I", 2);
        Oto oto = new Oto("Porsche", 2025, 4050000000L, 4, "Xăng", 1988);

        System.out.println("THONG TIN XE MAY");
        xeMay.hienThiThongTin();
        System.out.println("Dung tich xi lanh: " + xeMay.layVanTocToiDa());
        System.out.println("So cho ngoi: " + xeMay.laySoChoNgoi());

        System.out.println("THONG TIN XE OTO");
        oto.hienThiThongTin();
        System.out.println("Kieu dong co: " + oto.getKieuDongCo());
        System.out.println("Dung tich xi lanh: " + oto.layVanTocToiDa());
        System.out.println("So cho ngoi: " + oto.laySoChoNgoi());
    }
}