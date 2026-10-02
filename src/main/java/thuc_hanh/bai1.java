package thuc_hanh;

public class bai1 {
    public static void main(String[] args) {
        int[] mamon = {3, 1, 3, 2, 1, 3};
        int maxCount = 0;

        int i;
        for (i = 0; i < mamon.length; i++) {
            int count = 0;

            for (int j = 0; j < mamon.length; j++) {
                if (mamon[i] == mamon[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        for ( i = 0; i < mamon.length; i++) {
            int xuathien = 0;

            for (int k = 0; k < i; k++) {
                if (mamon[k] == mamon[i]) {
                    xuathien++;
                }
            }

            if (xuathien == 0) {
                int count = 0;

                for (int j = 0; j < mamon.length; j++) {
                    if (mamon[i] == mamon[j]) {
                        count++;
                    }
                }
                if (count == maxCount) {
                    System.out.println(
                            "Mon " + mamon[i] + " ban chay nhat: " + count + " lan");
                }
            }
        }
    }
}