package com.contest.biweekly.n70.c;

import java.util.*;

public class Solution {
    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] distances = new int[m][n];
        for (int[] distarr : distances) Arrays.fill(distarr, Integer.MAX_VALUE);
        Set<String> v = new HashSet<>();
        v.add(start[0] + "," + start[1]);
        bfs(grid, distances, v, start);
        List<List<Integer>> av = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0 && grid[i][j] != 1) {
                    if (pricing[0] <= grid[i][j] && grid[i][j] <= pricing[1] && distances[i][j] != Integer.MAX_VALUE) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(distances[i][j]); temp.add(grid[i][j]);
                        temp.add(i); temp.add(j);
                        av.add(temp);
                    }
                }
            }
        }
        av.sort((l1, l2) -> {
            if (l1.get(0).equals(l2.get(0))) {
                if (l1.get(1).equals(l2.get(1))) {
                    if (l1.get(2).equals(l2.get(2))) {
                        return l1.get(3).compareTo(l2.get(3));
                    } else {
                        return l1.get(2).compareTo(l2.get(2));
                    }
                } else {
                    return l1.get(1).compareTo(l2.get(1));
                }
            } else {
                return l1.get(0).compareTo(l2.get(0));
            }
        });
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i >= av.size())
                break;
            List<Integer> temp = new ArrayList<>();
            temp.add(av.get(i).get(2));
            temp.add(av.get(i).get(3));
            result.add(temp);
        }
        return result;
    }
    public void bfs(int[][] grid, int[][] distances, Set<String> v, int[] start) {
        int m = grid.length;
        int n = grid[0].length;
        Deque<int[]> q = new LinkedList<>();
        q.offer(start);
        int dist = 0;
        while (!q.isEmpty()) {
            Deque<int[]> newq = new LinkedList<>();
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                distances[curr[0]][curr[1]] = dist;
                for (int[] coord : new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}) {
                    int newx = curr[0] + coord[0];
                    int newy = curr[1] + coord[1];
                    boolean f1 = 0 <= newx && newx < m;
                    if (!f1) continue;
                    boolean f2 = 0 <= newy && newy < n;
                    if (!f2) continue;
                    boolean f3 = grid[newx][newy] != 0;
                    if (!f3) continue;
                    boolean f4 = !v.contains(newx + "," + newy);
                    if (!f4) continue;
                    v.add(newx + "," + newy);
                    newq.offer(new int[] {newx, newy});
                }
            }
            dist++;
            q = newq;
        }
    }
}