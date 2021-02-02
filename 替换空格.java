package com.wencongxiao.leetcode;

public class 替换空格 {

    public String replaceSpace(String s) {
String[] strArray=s.split("");
StringBuilder stringBuilder=new StringBuilder();
int end=strArray.length-1;
for (String i:strArray) {
    if (i.equals(" "))
        stringBuilder.append("%20");
    else
stringBuilder.append(i);
}
String res=stringBuilder.toString();
        return res;
    }
    public static void main(String args[]) {


    }
}
