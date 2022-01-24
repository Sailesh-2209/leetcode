package com.problems;

import com.helpers.Input;

import java.util.HashMap;
import java.util.Map;

public class lc0329 {
    static Map<String, Integer> map;
    public static void main(String[] args) {
        Input input = new Input();
        int[][] matrix = input.inputIntegerArray2d();
        int result = longestIncreasingPath(matrix);
        System.out.println(result);
    }
    public static int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, bfs(matrix, i, j, 1));
            }
        }
        return ans;
    }
    public static int bfs(int[][] matrix, int startx, int starty, int len) {
        String key = startx + "," + starty;
        if (map.containsKey(key))
            return map.get(key);
        int m = matrix.length;
        int n = matrix[0].length;
        int a = 0, b = 0, c = 0, d = 0;
        if (startx + 1 < m && matrix[startx + 1][starty] > matrix[startx][starty])
            a = bfs(matrix, startx + 1, starty, 1);
        if (starty + 1 < n && matrix[startx][starty + 1] > matrix[startx][starty])
            b = bfs(matrix, startx, starty + 1, 1);
        if (startx - 1 >= 0 && matrix[startx - 1][starty] > matrix[startx][starty])
            c = bfs(matrix, startx - 1, starty, 1);
        if (starty - 1 >= 0 && matrix[startx][starty - 1] > matrix[startx][starty])
            d = bfs(matrix, startx, starty - 1, 1);
        len += Math.max(a, Math.max(b, Math.max(c, d)));
        map.put(key, len);
        return len;
    }
}
