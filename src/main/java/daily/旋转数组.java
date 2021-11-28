package daily;

import java.util.Arrays;

public class 旋转数组 {
    private static int[] reverse(int[] arrs,int i,int j)
    {
            while (i<j)
            {
                int temp = arrs[j];
                arrs[j] = arrs[i];
                arrs[i] = temp;
                i++;
                j--;
            }
            return arrs;
    }
    public static void rotate(int[] nums, int k) {
        //空间O(1)
//        System.out.println(next(nums,k);
        reverse(nums,0, nums.length-1);
        reverse(nums,0, k%nums.length-1);
        reverse(nums,k%nums.length, nums.length-1);
    }

    public static void main(String[] args) {
        int[] arrat={1,2,3,4,5,6,7};
        rotate(arrat,3);
    }
}
