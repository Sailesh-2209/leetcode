package com.contest.weekly.n277.a;

public class Solution {
        public int countElements(int[] nums) {
            int max = Integer.MIN_VALUE;
            int nummax = 0;
            int min = Integer.MAX_VALUE;
            int nummin = 0;
            int n = nums.length;
            for (int num : nums) {
                if (num > max) {
                    max = num;
                    nummax = 0;
                }
                if (num < min) {
                    min = num;
                    nummin = 0;
                }
                if (num == max) nummax++;
                if (num == min) nummin++;
            }
            if (max != min)
                return n - nummin - nummax;
            return n - nummin;
        }
}
