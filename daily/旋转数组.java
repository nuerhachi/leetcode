package daily;

public class 旋转数组 {
    private static int[] next(int[] arrs,int k)
    {
        if (k>0){
            int trans = arrs[arrs.length-1];
            for (int i = arrs.length-1; i > 0 ; i--) {
                arrs[i] =arrs[i--];
            }
            arrs[0] = trans;
            return next(arrs,k--);
        }
        else return arrs;
    }
    public void rotate(int[] nums, int k) {
        //空间O(1)
//        System.out.println(next(nums,k);

    }

    public static void main(String[] args) {
        int[] arrat={1,2,3,4,5,6,7};
        System.out.println(next(arrat,3));
    }
}
