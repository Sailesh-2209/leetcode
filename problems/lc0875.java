package com.problems;

import com.helpers.Input;

import java.util.Arrays;

public class lc0875 {
    public static void main(String[] args) {
        Input input = new Input();
        int[] piles = input.inputIntegerArray();
        int h = 8;
        int result = minEatingSpeed(piles, h);
        System.out.println(result);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for (int i = 0; i < n; i++)
            max = Math.max(max, piles[i]);
        int lo = 1, hi = max;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(mid, piles, h)) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
    public static boolean check(int val, int[] piles, int h) {
        int n = piles.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (piles[i] / val);
            if (piles[i] % val != 0) ans++;
        }
        return ans <= h;
    }
}
