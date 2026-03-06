import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int muc;
    public static void main(String[] args) {

        //data
        ArrayList<ThuVien> thuVien = new ArrayList<>();
        ThuVien sach1 = new ThuVien();

        //sach 1
        sach1.setMaSach("FER174");
        sach1.setTenSach("Nhat Ki Cay Me");
        sach1.setTacGia("Alesander Ponikov");
        sach1.setNamXuatBan(2006);
        sach1.setTrangThai(false);
        thuVien.add(sach1);

        tuyChon();

    }
    public static void tuyChon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thu Vien Cay Nha La Canh | v1.0");
        System.out.println("");
        System.out.println(" Ban muon lam gi?");
        System.out.println(" 1. Toi muon muon sach");
        System.out.println(" 2. Toi muon tra sach");
        System.out.println(" 3. Thoat");
        System.out.print("Vui long chon muc (1 - 3): ");
        muc = scanner.nextInt();
    }
}