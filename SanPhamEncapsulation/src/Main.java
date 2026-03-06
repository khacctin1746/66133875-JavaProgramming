public class Main {
    public static void main(String[] args) {

        // test case 1:
        SanPham sp1 = new SanPham();
        sp1.setMaSP("UU1QK");
        sp1.setTenSP("Keo Mut");
        sp1.setGia(10000);
        sp1.setSoLuong(2);
        sp1.tinhThanhTien();
        sp1.hienThiThongTin();

        // test case 2:
        SanPham sp2 = new SanPham();
        sp2.hienThiThongTin();

        //test case 3:
        SanPham sp3 = new SanPham();
        sp3.setMaSP("");
        sp3.setTenSP("");
        sp3.setGia(-1);
        sp3.setSoLuong(-1);
    }

}