package before;
/*
Created by wcx
*/

import java.util.HashSet;

public class 和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) right--;
            else if (nums[left] + nums[right] < target) left++;
            else break;

        }
        res[0] = nums[left];
        res[1] = nums[right];
        return res;
    }

}
