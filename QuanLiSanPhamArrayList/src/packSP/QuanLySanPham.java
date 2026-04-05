package packSP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySanPham extends SanPham {
    private ArrayList<SanPham> ds = new ArrayList<>();

    //Hien thi toan bo thong tin san pham
    public void hienThiFull() {
        for(SanPham sp : ds) {
            System.out.println("= = = = = = = = = = = = = = = = = =");
            System.out.println("- Ma san pham: " + sp.getMaSp());
            System.out.println("- Ten san pham: " + sp.getTenSp());
            System.out.println("- Gia san pham: " + sp.getGia());
            System.out.println("- So luong: " + sp.getSoLuong());
        }
    }
    // Hien thi thong tin san pham
    public void hienThi() {
        System.out.println("- Ma san pham: " + getMaSp());
        System.out.println("- Ten san pham: " + getTenSp());
        System.out.println("- Gia san pham: " + getGia());
        System.out.println("- So luong: " + getSoLuong());
    }
    // Them san pham
    public void themSP(SanPham sp) {
        ds.add(sp);
    }

    // Xoa san pham
    public void xoaSP(String maSP) {
        for(SanPham sanPham : ds) {
            if(sanPham.getMaSp().toLowerCase().equals(maSP)) {
                System.out.println("= Da xoa thanh cong san pham: " + maSP);
                ds.remove(sanPham);
                break;
            }
        }
    }

    //liet ke san pham sap chay hang
    public void lietKe() {
        System.out.println("+ DANH SACH SAN PHAM CHAY HANG");
        for(SanPham sanPham : ds) {
            if(sanPham.getSoLuong() < 10) {
                System.out.println("- Ma san pham: " + sanPham.getMaSp());
                System.out.println("- Ten san pham: " + sanPham.getTenSp());
                System.out.println("- Gia san pham: " + sanPham.getGia());
                System.out.println("- So luong: " + sanPham.getSoLuong());
                System.out.println("= = = = = = = = = = = = = = = = = =");
            }
        }
    }
    //sọt thấp tới cao
    public void sortSP() {
        Collections.sort(ds, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        });
        System.out.println("= Da sọt thành công theo giá từ thấp -> cao");
    }

    // cộng tổng giá trị kho hàng
    public void tongKho() {
        double giaTri = 0;
        for(SanPham sanPham : ds) {
            System.out.println("- Ma: " + sanPham.getMaSp() + " | So luong: " + sanPham.getSoLuong() + " | Gia tri/1 vat pham: " + sanPham.getGia() + " | Tong gia tri: " + sanPham.getGia()* sanPham.getSoLuong());
            giaTri += sanPham.getGia() * sanPham.getSoLuong();
        }
        System.out.println("= Gia tri cua kho la: " + giaTri);
    }

    // Tim san pham theo ten
    public void timSP(String tenSP) {
        for(SanPham sanPham : ds) {
            if(sanPham.getTenSp().toLowerCase().contains(tenSP.toLowerCase())) {
                System.out.println("= = = = = = = = = = = = = = = = = = = = =");
                System.out.println("- Ma san pham: " + sanPham.getMaSp());
                System.out.println("- Ten san pham: " + sanPham.getTenSp());
                System.out.println("- Gia san pham: " + sanPham.getGia());
                System.out.println("- So luong: " + sanPham.getSoLuong());
                System.out.println("= = = = = = = = = = = = = = = = = = = = =");
            }
        }
    }


}
