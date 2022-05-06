package daily;


import java.util.HashMap;
import java.util.Map;

public class 字符串中的第一个唯一字符 {
       public int firstUniqChar(String s) {

           /**  ①、双向查找 **/
           /*for (int i = 0; i < s.length(); i++)
               if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                   return i;
           return -1;*/
           /**  ②、hashmap计数 **/

           Map<Character,Integer> map = new HashMap<>();
           for (int i = 0; i < s.length(); i++) {
               int count = 0;
               if (!map.containsKey(s.charAt(i)))
                   map.put(s.charAt(i),count++);
               else
               {
                   count = map.get(s.charAt(i));
               }

           }

           return -1;

       }

    public static void main(String[] args) {
        System.out.println("Stg".equalsIgnoreCase("stg"));
        for (int i = 0; i < 5; i++) {
            if (i==1)
                break;
            System.out.println(i);
            System.out.println("111111");
        }
    }
}
