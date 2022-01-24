package com.contest.weekly.n277;

import com.helpers.Input;
import com.helpers.Output;

import java.util.List;

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
        com.contest.weekly.n277.a.Solution solution_a = new com.contest.weekly.n277.a.Solution();
        int[] ain1 = input.inputIntegerArray();
        int result_a = solution_a.countElements(ain1);
        System.out.println(result_a);
    }
    public static void runB() {
        com.contest.weekly.n277.b.Solution solution_b = new com.contest.weekly.n277.b.Solution();
        int[] bin1 = input.inputIntegerArray();
        int[] result_b = solution_b.rearrangeArray(bin1);
        output.outputIntegerArray(result_b);
    }
    public static void runC() {
        com.contest.weekly.n277.c.Solution solution_c = new com.contest.weekly.n277.c.Solution();
        int[] cin1 = input.inputIntegerArray();
        List<Integer> result_c = solution_c.findLonely(cin1);
        System.out.println(result_c);
    }
    public static void runD() {
        com.contest.weekly.n277.d.Solution solution_d = new com.contest.weekly.n277.d.Solution();
        int[][] din1 = input.inputIntegerArray2d();
        int result_d = solution_d.maximumGood(din1);
        System.out.println(result_d);
    }
}
