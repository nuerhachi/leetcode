package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 两个数组的交集 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length,len2 = nums2.length,i=0,j=0;
        List<Integer> arrayList = new ArrayList<>();
        while (i<len1&&j<len2)
        {
            if (nums1[i] == nums2[j])
            { arrayList.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] > nums2[j])
                j++;
            else if (nums1[i] < nums2[j])
            i++;
        }
        int[] result =new int[arrayList.size()];
        for (int k = 0; k < result.length; k++) {
            result[k]= arrayList.get(k);
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] a1= new int[]{1,1,2,2};
        int[] a2= new int[]{2,2};
       intersect(a1,a2);
/*
        int[] a1= new int[]{4,9,5};
        int[] a2= new int[]{9,4,9,8,4};
       intersect(a1,a2);
*/
    }
}
