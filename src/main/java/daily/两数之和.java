package daily;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (store.containsKey(nums[i])) {
                result[0] = store.get(nums[i]);
                result[1] = i;
            }
            store.put(target - nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(a, 9)));
/*        String time="20101125102503";
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-HH-dd HH:mm:ss");
        SimpleDateFormat formatter2=new SimpleDateFormat("yyyyHHddHHmmss");
        try {
            time=formatter1.format(formatter2.parse(time));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(time);*/
    }
}
