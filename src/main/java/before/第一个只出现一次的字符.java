package before;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class 第一个只出现一次的字符 {

   public static char firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        char[] arr = s.toCharArray();
        for (char i : arr)
            if (!hashMap.containsKey(i))
                hashMap.put(i, 1);
            else
                hashMap.put(i, hashMap.get(i)+1);
for (Map.Entry<Character,Integer> entry:hashMap.entrySet()) {
    System.out.print(entry.getKey());
    System.out.println(entry.getValue());
    if (entry.getValue() == 1)
        return entry.getKey();
}
        return ' ';

    }

    public static void main(String args[]) {

firstUniqChar("leetcode" );
    }
}
