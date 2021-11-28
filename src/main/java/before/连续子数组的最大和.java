package before;

import java.util.Arrays;

public class 连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
int len=nums.length,res=nums[0];
for(int i=1;i<len;i++) {
    nums[i] = nums[i] + ((nums[i - 1] > 0) ? nums[i - 1] : 0);
    res=Math.max(res,nums[i]);
}


     return res;
    }

    public static void main(String args[]) {


    }
}
