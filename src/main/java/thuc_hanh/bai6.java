package thuc_hanh;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen duong: ");
        int soNguyen = scanner.nextInt();

        if (soNguyen < 0 ) {
            System.out.println(" nhap so lon hon 0");
        }else {
            String nhiPhan = "";

            while (soNguyen > 0) {
                int du = soNguyen % 2;
                nhiPhan = du + nhiPhan;
                soNguyen = soNguyen / 2;
            }
            System.out.println("nhi phan:"  + nhiPhan);
        }
    }
}
