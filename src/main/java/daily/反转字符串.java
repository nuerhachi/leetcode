package daily;

public class 反转字符串 {
    public void reverseString(char[] s) {
        char temp;
        int i=0,j=s.length-1;
        while (i<j)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
