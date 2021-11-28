package before;
/*
Created by wcx
*/

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 圆圈中最后剩下的数字 {
    //递归
   /* public int lastRemaining(int n, int m) {
        if (n==1)
            return 0;
        else return (m+lastRemaining(n-1,m))%n;

    }*/

  public int lastRemaining(int n, int m) {
    int x=0;
    for (int i=2;i<=n;i++)
        x=(x+m)%i;
    return x;
    }
}
