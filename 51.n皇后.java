import java.util.ArrayList;
import java.util.List;


/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N皇后
 */

// @lc code=start
class Solution {

    public  List<List<String>> list = new ArrayList<>();
    //利用二维数组来记录棋盘
    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        backTrace(board, 0, n);
        return list;
    }

    //以一行为单位进行回溯
    public  void backTrace(int[][] a,int row,int n){
        for(int i = 0;i < n;i++){
            if(a[row][i] == 0 && isCanDown(a, row, i, n)){
                //落子
                a[row][i] = 1;
                //如果每行都已经落在完成
                if(row == n - 1){
                    //记录结果
                    addList(a);
                    //恢复棋盘
                    a[row][i] = 0;
                    //本行不在进行循环
                    return;
                }else{
                    backTrace(a, row + 1, n);
                }
                a[row][i] = 0;
            }
        }
    }



    //记录结果
    private  void addList(int[][] a) {
        List<String> li = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 0) str.append('.');
                else if (a[i][j] == 1) str.append('Q');
            }
            li.add(str.toString());
        }
        list.add(li);
    }

    // 判断该位置是否可落子
    public static boolean isCanDown(int[][] board,int row,int column,int n){
        //检查所在行是否有皇后存在
        for(int i = 0;i < n;i++){
            if(board[row][i] == 1){
                return false;
            }
        }

        //检查所在列是否有皇后存在
        for(int i = 0;i < n;i++){
            if(board[i][column] == 1){
                return false;
            }
        }

        //检查对角线是否有皇后存在,可以分为四个方向来进行检测 左上，左下，右上，右下
        for(int i = row,j = column;isOutOfIndex(i, j, n);i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row,j = column;isOutOfIndex(i, j, n);i++,j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row,j = column;isOutOfIndex(i, j, n);i--,j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row,j = column;isOutOfIndex(i, j, n);i++,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }


    //防止row，column越界
    public static boolean isOutOfIndex(int i,int j,int n){
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}
// @lc code=end

