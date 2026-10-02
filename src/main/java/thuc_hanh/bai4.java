package thuc_hanh;

import javax.naming.NamingEnumeration;
import java.sql.SQLOutput;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        int a = scanner.nextInt();
        System.out.println("Nhap mau so: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Mau so phai khac 0");
        }else {
            int x = Math.abs(a);
            int y = Math.abs(b);

            while (y !=0) {
                int du = x % y;
                x = y;
                y = du;
            }
            int uocChungLonNhat = x;
            a = a / uocChungLonNhat;
            b = b / uocChungLonNhat;

        }
        System.out.println("Phan so rut gon: " + a + "/" + b);
    }
}
