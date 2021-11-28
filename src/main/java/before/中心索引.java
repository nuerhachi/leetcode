package before;

public class 中心索引 {


    static int pivotIndex(int[] nums) {
        if (nums.length==0)
            return -1;
        int leftSum=0;
        int Sum=0;
        for (int i=0;i<nums.length;i++)
            Sum+=nums[i];
        for (int i=0;i<nums.length;i++) {
            if (leftSum== Sum - leftSum - nums[i])
                return i;
            leftSum+=nums[i];

        }
            return -1;


    }
    public static void main(String args[])
    {
        int array[]={};
        System.out.println(pivotIndex(array));
    }
}
