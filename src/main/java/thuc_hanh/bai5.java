package thuc_hanh;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 4, 7, 9, 12};

        System.out.print("Nhap so can tim: ");
        int x = scanner.nextInt();
        int left = 0;
        int right = numbers.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == x) {
                index = mid;
                break;
            } else if (numbers[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        if (index == -1) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Vi tri: " + (index + 1));
        }
    }
}