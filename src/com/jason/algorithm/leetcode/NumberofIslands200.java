package com.jason.algorithm.leetcode;

import java.util.Arrays;

/**
 * Created by jsson on 20/3/8.
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 Example 1:
 Input:
 11110
 11010
 11000
 00000

 Output: 1
 Example 2:
 Input:
 11000
 11000
 00100
 00011

 Output: 3

 */
public class NumberofIslands200 {
    private int d[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int m, n;
    private boolean inArea(int x, int y) {
        return x > 0 && x < m && y > 0 && y < n;
    }
    private boolean visted[][];
    private void fooldFill(char[][] grid, int startX, int startY) {
        visted[startX][startY] = true;

        for (int i = 0; i < 4; i++) {
            int newX = startX + d[i][0];
            int newY = startY + d[i][1];
            if (inArea(newX, newY) && !visted[newX][newY] && grid[newX][newY] == '1') {
                fooldFill(grid, newX, newY);
            }
        }
    }
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        visted = new boolean[m][n];
//        Arrays.fill(visted, false);

        int res = 0;
        for (int i = 0; i< m; i++) {
            for(int j =0; j < n; j++) {
                System.out.println(visted[i][j]);
                if (grid[i][j] == '1' && !visted[i][j]) {
                    res ++;
                    fooldFill(grid, i, j);
                }
            }
        }

        return res;
    }
}
