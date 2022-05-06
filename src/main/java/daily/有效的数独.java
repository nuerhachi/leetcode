package daily;

import java.util.HashSet;
import java.util.Set;

public class 有效的数独 {

    public boolean isValidSudoku(char[][] board) {

        /**
         * 每行、每列、每块
         */

        //行
        int l = board.length;
        for (int i = 0; i < l; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < l; j++) {
                if (set.contains(board[i][j]))
                    return false;
                else  if (board[i][j]!='.')
                    set.add(board[i][j]);
            }
        }
        //列
        for (int i = 0; i < l; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < l; j++) {
                if (set.contains(board[j][i]))
                    return false;
                else if (board[j][i]!='.')
                    set.add(board[j][i]);
            }
        }
        //小九宫
        Set<Character> set = new HashSet<>();

        int l1= l/3;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l1; j++) {
                if (set.contains(board[i][j]))
                    return false;
                else if (i%3==2 && (i+j)%3 ==1)
                {
                    set.clear();
                }
                else if (board[i][j]!='.')
                    set.add(board[i][j]);
            }
        }
        set.clear();

        for (int i = 0; i < l; i++) {
            for (int j = l1; j < l1*2; j++) {
                if (set.contains(board[i][j]))
                    return false;
                else if (i%3==2 && (i+j)%3 ==1)
                {
                    set.clear();
                }
                else if (board[i][j]!='.')
                    set.add(board[i][j]);
            }
        }
        set.clear();

        for (int i = 0; i < l; i++) {
            for (int j = l1*2; j < l1*3; j++) {
                if (set.contains(board[i][j]))
                    return false;
                else if (i%3==2 && (i+j)%3 ==1)
                {
                    set.clear();
                }
                else if (board[i][j]!='.')
                    set.add(board[i][j]);
            }
        }
        return true;
    }
}
