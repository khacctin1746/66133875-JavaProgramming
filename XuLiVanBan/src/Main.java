public class Main {
    public static void main(String[] args) {
        VanBan vanBan = new VanBan();
        vanBan.docVanBan();
        vanBan.tinhSoTu();
        vanBan.tinhSoCau();
        vanBan.tinhTuXuatHien();
        System.out.println(vanBan.getText());
        System.out.println("Số từ: " + vanBan.getSoTu());
        System.out.println("Số câu: " + vanBan.getSoCau());
        System.out.println("Từ nhiều nhất: " + vanBan.getTuNhieuNhat());
    }
}