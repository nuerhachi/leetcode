package before;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 数组中出现次数超过一半的数字 {
    public int majorityElement(int[] nums) {
        int target = nums.length >>> 1;
        Arrays.sort(nums);
        int res = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        int count = 0;
        for (int i : nums) {
            if (hashSet.contains(i))
                count++;
            else {
                hashSet.add(i);
                count = 1;
            }
            if (count > target)
                res = i;
        }
        return res;
    }

    public static void main(String args[]) {


    }
}
