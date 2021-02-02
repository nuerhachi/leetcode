package com.wencongxiao.leetcode;

import java.util.LinkedList;

public class 有效的括号 {
    public static boolean isValid(String s) {
        LinkedList<String> linkedList = new LinkedList<>();
        String[] arr = s.split("");
        for (String i : arr) {
            boolean a, b, c;
            String top = linkedList.peek();
            if (top == null)
                a = b = c = false;
            else {
                c = i.equals("]") && top.equals("[");
                b = i.equals("}") && top.equals("{");
                a = i.equals(")") && top.equals("(");
            }


             if (i.equals("(") || i.equals("{") || i.equals("["))
                linkedList.addFirst(i);
            else if (a || b || c)
                linkedList.pop();
            else return false;
        }
        return linkedList.isEmpty();

    }

    public static void main(String args[]) {
        System.out.println(isValid("}"));

    }
}
