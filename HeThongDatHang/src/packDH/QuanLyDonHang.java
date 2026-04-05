package packDH;

import java.util.ArrayList;

public class QuanLyDonHang extends DonHang {
    private ArrayList<DonHang> ds = new ArrayList<>();

    // them don hang
    public void themDonHang(DonHang donHang) {
        ds.add(donHang);
    }
}
