package daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        /**1.set方法**/
/*        Set<Integer> set =new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;*/
        /**2.**/
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] ==nums[i-1])
                return true;
        }
        return false;
    }
}
