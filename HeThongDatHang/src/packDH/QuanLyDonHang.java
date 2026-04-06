package packDH;

import java.util.ArrayList;

public class QuanLyDonHang {
    private ArrayList<DonHang> ds = new ArrayList<>();

    // them don hang
    public void themDonHang(DonHang donHang) {
        ds.add(donHang);
    }
    // them mo ta cho don hang (ung dung cai danhSachSanPham o DonHang)
    public void themSanPhamVaoDon(String maDH, String sanPham) {
        for(DonHang donHang : ds) {
            if(donHang.getMaDH().equalsIgnoreCase(maDH)) {
                donHang.themSanPham(sanPham);
                return;
            }
        }
        System.out.println("= Khong tim thay don hang");
    }

    public void moTa(String maDH) {
        for(DonHang dh : ds) {
            if(dh.getMaDH().equalsIgnoreCase(maDH)) {
                System.out.println("+ DON HANG | Ma: " + dh.getMaDH());
                System.out.println("- Ten khach hang: " + dh.getTenKH());
                System.out.println("- Mo ta san pham: ");
                for(String sp : dh.getDanhSachSanPham()) {
                    System.out.println("> " + sp);
                }
                System.out.println("- Tong tien: " + dh.getTongTien());
                return;
            }
        }
        System.out.println("= Khong tim thay ma don hang!");
    }
}
