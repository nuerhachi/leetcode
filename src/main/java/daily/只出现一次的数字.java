package daily;

import java.util.Arrays;

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i:nums) {
            result ^= i;
        }
        return result;
    }
}
