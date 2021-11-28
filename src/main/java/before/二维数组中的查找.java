package before;

import java.util.HashSet;

public class 二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n=matrix.length;
        if(n==0)
            return false;
        int m=matrix[0].length;
        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0; i<n;i++)
            for(int j=0; j<m;j++)
                hashset.add(matrix[i][j]);

        return (hashset.contains(target))?true:false;

    }

    public static void main(String args[]) {


    }
}
