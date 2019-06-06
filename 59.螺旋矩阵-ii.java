/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */
class Solution {
    public int[][] generateMatrix(int n) {
            int[][] arr = new int[n][n];
            int x = 0,y = 0,dx = 0,dy = 1;
            try{
            for(int i = 1;i <= n*n; i++){
                arr[x][y] = i;
                if(arr[(x + dx)%n][(y + dy)%n] > 0){
                    int temp = dx;
                    dx = dy;
                    dy = -temp;
                } 
                x += dx;
                y += dy;
                System.out.print(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            return arr;
    }
}

