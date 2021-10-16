public class 大小k均值大t的自数组数目 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int len = arr.length, result = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum - k * threshold >= 0)
            result++;
        for (int j = 0; j + k < len; j++)
        {
            sum = sum - arr[j] + arr[j+k];
            if (sum - k * threshold >= 0)
                result++;
        }
            return result;
    }

    public static void main(String[] args) {
        int array[]=new int[]{2,2,2,2,5,5,5,8};
        System.out.println(numOfSubarrays(array,3,4));
    }
}
