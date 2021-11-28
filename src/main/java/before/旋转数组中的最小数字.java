package before;

public class 旋转数组中的最小数字 {

    public int minArray(int[] numbers) {
        for (int i=1;i<numbers.length;i++)
        {if(numbers[i-1]>numbers[i])
    return numbers[i];}
return numbers[0];
    }
    public static void main(String args[]) {

    }
}
