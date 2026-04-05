import java.util.Arrays;
import java.util.Scanner;

public class VanBan {
    private String text;
    private long soTu;
    private long soCau;
    private String tuNhieuNhat;
    private int countTuNhieuNhat;
    private int tuDaCheck;
    private String[] luutru;
    private String[] previousText;

    Scanner scanner = new Scanner(System.in);

    //getter
    public String getText() {
        return this.text;
    }

    public long getSoTu() {
        return this.soTu;
    }

    public long getSoCau() {
        return this.soCau;
    }

    public String getTuNhieuNhat() {
        return this.tuNhieuNhat;
    }

    public int getCountTuNhieuNhat() {
        return this.countTuNhieuNhat;
    }

    public void docVanBan() {
        text = scanner.nextLine();
    }

    public void tinhSoTu() {
        // "\\s+" là đếm khoảng trắng để tính các từ
        soTu = Arrays.stream(text.split("\\s+")).parallel().count();
    }

    public void tinhSoCau() {
        // "[.!?]+ là dùng để tìm các phần có . ? ! để đếm"
        soCau = Arrays.stream(text.split("[.!?]+")).parallel().count();
    }

    public void tinhTuXuatHien() {
        //Đầu tiên là tách text trước và lưu một mảng riêng tên luutru
        luutru = Arrays.stream(text.split("\\W+")).parallel().filter(w -> !w.isEmpty()).toArray(String[]::new);
        // lặp
        int size = luutru.length;
        // cấp phát bộ nhớ cho thằng previousText
        previousText = new String[size];
        for(int i = 0; i < size; i++) {
            String stext = luutru[i];
            // cho trước thằng tuDaCheck được cộng để triển khai vòng lặp ở checkText
            tuDaCheck++;
            int dem = 0;
            if(checkText(stext) == true) {
                previousText[tuDaCheck] = stext;
                for(int j = i; j < size; j++) {
                    if(luutru[j].equals(stext)) {
                        dem++;
                    }
                }
                if(dem > countTuNhieuNhat) {
                    countTuNhieuNhat = dem;
                    tuNhieuNhat = stext;
                }
            }
        }
    }

    public boolean checkText(String stext) {
        for(int i = 0; i < tuDaCheck; i++) {
            if(previousText[i] == null) {
                tuDaCheck--;
                return true;
            }
            if(previousText[i].contains(stext)) {
                tuDaCheck--;
                return false;
            }
        }
        return true;
    }
}
