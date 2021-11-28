package before;

public class 翻转单词顺序 {

    public String reverseWords(String s) {

        String[] arr=s.split("\\s+");
        StringBuilder res=new StringBuilder();

        int len=arr.length-1;
        for (int i=len;i>=0;i--)
            res.append(arr[i]+" ");
        return  res.toString().trim();
    }
    public static void main(String args[]) {

        System.out.println();
    }
}
