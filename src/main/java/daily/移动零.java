package daily;

import java.util.Arrays;

public class 移动零 {
    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0, len = nums.length;
        while (i < len && j < len) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        if (i <= len - 1) {
            for (int k = i; k < len; k++) {
                nums[k] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,3,12};
        moveZeroes(a);
    }
}
