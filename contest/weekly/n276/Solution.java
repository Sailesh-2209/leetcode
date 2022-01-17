// contest link: https://leetcode.com/contest/weekly-contest-276/

package com.contest.weekly.n276;

import com.helpers.Input;
import com.helpers.Output;

public class Solution {
    static Input input = new Input();
    static Output output = new Output();

    public static void main(String[] args) {
        runA();
//        runB();
//        runC();
//        runD();
    }
    public static void runA() {
        String ain1 = "abcdefghif";
        int ain2 = 3;
        char ain3 = 'x';
        com.contest.weekly.n276.a.Solution solution_a = new com.contest.weekly.n276.a.Solution();
        String[] result_a = solution_a.divideString(ain1, ain2, ain3);
        output.outputStringArray(result_a);
    }
    public static void runB() {
        int bin1 = 5;
        int bin2 = 0;
        com.contest.weekly.n276.b.Solution solution_b = new com.contest.weekly.n276.b.Solution();
        int result_b = solution_b.minMoves(bin1, bin2);
        System.out.println(result_b);
    }
    public static void runC() {
        int[][] cin1 = input.inputIntegerArray2d();
        com.contest.weekly.n276.c.Solution solution_c = new com.contest.weekly.n276.c.Solution();
        long result_c = solution_c.mostPoints(cin1);
        System.out.println(result_c);
    }
    public static void runD() {
        int din1 = 2;
        int[] din2 = input.inputIntegerArray();
        com.contest.weekly.n276.d.Solution solution_d = new com.contest.weekly.n276.d.Solution();
        long result_d = solution_d.maxRunTime(din1, din2);
        System.out.println(result_d);
    }
}
