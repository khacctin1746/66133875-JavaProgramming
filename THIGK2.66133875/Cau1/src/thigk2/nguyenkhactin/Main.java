package thigk2.nguyenkhactin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nhập chiều cao (cm) và cân nặng (kg) từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("- Vui long nhap chieu cao: ");
        double chieuCao = scanner.nextDouble();
        System.out.print("- Vui long nhap can nang: ");
        double canNang = scanner.nextDouble();

        // chuyển chiều cao từ cm -> m để thực hiện tính toán
        chieuCao = chieuCao / 100;

        // công thức tính bmi của bộ y tế
        double bmi = canNang / (chieuCao * chieuCao);

        //in ra kết quả bmi
        System.out.println("> Chỉ số bmi của bạn là: " + bmi);

        //in ra kết quả về tình trạng cơ thể tương ứng.
        if(bmi < 18.5) {
            System.out.println("> Bạn loại người gầy");
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("> Bạn là người bình thường");
        } else if(bmi >= 25 && bmi <= 29.9) {
            System.out.println("> Bạn là người thừa cân");
        } else {
            System.out.print("> Bạn là người béo phì");
        }
    }
}