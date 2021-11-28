package before;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class 外观数列 {

    public static String countAndSay(int n) {
        StringBuilder res=new StringBuilder();
        if(n>1) {
            String str =countAndSay(n-1) ;
            int i = 1, j = 0, len =str.length() ;
            while (i <len)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    res.append(i-j).append(str.charAt(j));
                    j=i;
                }
                i++;
            }
            res.append(i-j).append(str.charAt(j));

        }
        return n==1?"1":res.toString();
    }
    public static void main(String args[]) {
        System.out.println(countAndSay(5));

    }
}
