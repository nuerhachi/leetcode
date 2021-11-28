package before;

public class 调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        if(nums.length!=0)
        {int i=0;
            int j=nums.length-1;
            while(i!=j)
            {
                while(nums[i]%2!=0&&i<j) i++;
                while(nums[j]%2==0&&i<j) j--;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }}
        return nums;
    }

    public static void main(String args[]) {


    }
}
