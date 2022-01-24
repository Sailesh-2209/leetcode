package com.problems;

import com.helpers.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// wrong answer

public class lc1998 {
    public static void main(String[] args) {
        Input input = new Input();
        int[] nums = input.inputIntegerArray();
        boolean result = gcdSort(nums);
        System.out.println(result);
    }
    static class UnionFind {
        int[] parent;
        public UnionFind(int n) { parent = new int[n]; }
        public int find(int x) {
            if (parent[x] != x)
                x = find(parent[x]);
            return parent[x];
        }
        public void union(int p, int q) {
            int pp = find(p);
            int qp = find(q);
            if (pp != qp)
                parent[pp] = qp;
        }
    }
    public static boolean gcdSort(int[] nums) {
        int n = nums.length;
        int max = Arrays.stream(nums).max().getAsInt();
        int[] spf = sieve(max + 1);
        UnionFind uf = new UnionFind(max + 1);
        for (int num : nums) {
            for (int factor : getPrimeFactors(n, spf))
                uf.union(num, factor);
        }
        int[] sortedNums = new int[n];
        for (int i = 0; i < n; i++)
            sortedNums[i] = nums[i];
        Arrays.sort(sortedNums);
        for (int i = 0; i < n; i++) {
            if (uf.find(nums[i]) != uf.find(sortedNums[i]))
                return false;
        }
        return true;
    }
    public static List<Integer> getPrimeFactors(int n, int[] spf) {
        List<Integer> result = new ArrayList<>();
        while (n > 1) {
            result.add(spf[n]);
            n /= spf[n];
        }
        return result;
    }
    public static int[] sieve(int n) {
        int[] result = new int[n];
        for (int i = 2; i < n; i++)
            result[i] = i;
        for (int i = 2; i < n; i++) {
            if (result[i] != i)
                continue;
            for (int j = i * i; j < n; j += i) {
                if (result[j] > i)
                    result[j] = i;
            }
        }
        return result;
    }
}
