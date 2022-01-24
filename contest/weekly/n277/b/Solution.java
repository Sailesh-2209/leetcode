package com.contest.weekly.n277.b;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> poss = new ArrayList<>();
        List<Integer> negs = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) poss.add(num);
            else negs.add(num);
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) result[i] = poss.get(i / 2);
            else result[i] = negs.get(i / 2);
        }
        return result;
    }
}
