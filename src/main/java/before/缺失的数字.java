package before;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 缺失的数字 {

    public int missingNumber(int[] nums) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        int len=nums.length,i=0;
        while (i<len)
        {    if (i!=nums[i])
                return i;
i++;}
        return i;
    }

    public static void main(String args[]) {


    }
}
