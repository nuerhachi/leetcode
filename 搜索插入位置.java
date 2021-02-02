package com.wencongxiao.leetcode;

public class 搜索插入位置 {
    static int searchInsert(int[] nums, int target) {
int left=0,right=nums.length-1,mid;
while (left<=right)
{
   mid =(left+right)/2;
    if (nums[mid]>target)
        right=mid-1;
else if (nums[mid]<target)
        left=mid+1;
 else
       return mid;
}
return left;
    }

    public static void main(String args[]) {
        int array[]={1,3,5,6};
        System.out.println(searchInsert(array,7));

    }
}
