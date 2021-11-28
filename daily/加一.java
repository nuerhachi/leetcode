package daily;

import java.util.Arrays;

public class 加一 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        /**1、越界**/
       /* int num = 0;
        for (int i = 0; i < len; i++) {
            num = num * 10 + digits[i];
        }
        num++;
        int newLen = (int) (num / Math.pow(10, len)) > 0 ? len + 1 : len;
        int[] result = new int[newLen];
        for (int i = newLen - 1; i >= 0; i--) {
            result[i] = num % 10;
            num /= 10;
        }*/
/**2、递归**/
       /* if (digits[len - 1] != 9) {
            digits[len - 1]++;
            return digits;
        } else {
            if (len > 1) {
                int[] arr = plusOne(Arrays.copyOfRange(digits, 0, len - 1));
                int[] re = Arrays.copyOf(arr, arr.length + 1);
                re[len - 1] = 0;
                return re;
            } else {
                int[] result = new int[len + 1];
                result[0] = 1;
                result[1] = 0;
                return result;

            }
        }*/

        /**3、官方**/
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]++;
                digits[i] = digits[i]++ % 10;
                if (digits[i] != 0) return digits;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
