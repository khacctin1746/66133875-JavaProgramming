import packDH.DonHang;
import packDH.QuanLyDonHang;

public class Main {
    public static QuanLyDonHang ql = new QuanLyDonHang();

    public static void main(String[] args) {
        // TEST SP1
        ql.themDonHang(new DonHang("FER174", "NGUYEN KHAC TIN", 128000));
        ql.themSanPhamVaoDon("FER174", "Tui nhua 100k");
        ql.themSanPhamVaoDon("FER174", "Monster Energy Ultra Zero 28k");
        ql.moTa();
    }
}