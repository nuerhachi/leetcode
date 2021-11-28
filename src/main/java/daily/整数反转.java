package daily;

public class 整数反转 {
    public int reverse(int x) {
        int result =0,y =0;
        while (x!=0) {
            if (result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&y>Integer.MAX_VALUE%10))
                return 0;
            if ((result==Integer.MIN_VALUE/10&&y<Integer.MIN_VALUE%10)||result<Integer.MIN_VALUE/10)
                return 0;
            y = x % 10;
            result=result*10+y;
            x=x/10;
        }
        return result;
    }

}
