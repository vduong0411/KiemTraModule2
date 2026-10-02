package thuc_hanh;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot cau: ");
        String cau = scanner.nextLine().trim();

        if (cau.isEmpty()) {
            System.out.println("Cau co 0 tu");
        } else {
            String[] cacTu = cau.split("\\s+");
            String tuDaiNhat = cacTu[0];

            for (int i = 1; i < cacTu.length; i++) {
                if (cacTu[i].length() > tuDaiNhat.length()) {
                    tuDaiNhat = cacTu[i];
                }
            }
            System.out.println("So tu: " + cacTu.length);
            System.out.println("Tu dai nhat: " + tuDaiNhat);
        }
    }
}

