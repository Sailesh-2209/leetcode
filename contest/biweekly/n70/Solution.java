package com.contest.biweekly.n70;

import com.helpers.Input;

import java.util.List;
import java.util.Scanner;

public class Solution {
    static Input input = new Input();

    public static void main(String[] args) {
//        runA();
//        runB();
//        runC();
        runD();
    }
    public static void runA() {
        com.contest.biweekly.n70.a.Solution solution_a = new com.contest.biweekly.n70.a.Solution();
        int[] ain1 = input.inputIntegerArray();
        int result_a = solution_a.minimumCost(ain1);
        System.out.println(result_a);
    }
    public static void runB() {
        com.contest.biweekly.n70.b.Solution solution_b = new com.contest.biweekly.n70.b.Solution();
        int[] bin1 = input.inputIntegerArray();
        int bin2 = 3;
        int bin3 = 6;
        int result_b = solution_b.numberOfArrays(bin1, bin2, bin3);
        System.out.println(result_b);
    }
    public static void runC() {
        Scanner scanner = new Scanner(System.in);
        String enter;
        com.contest.biweekly.n70.c.Solution solution_c = new com.contest.biweekly.n70.c.Solution();
        int[][] cin1 = input.inputIntegerArray2d();
        System.out.println("Hit the enter key after copying the new array.");
        scanner.next();
        int[] cin2 = input.inputIntegerArray();
        System.out.println("Hit the enter key after copying the new array.");
        scanner.next();
        int[] cin3 = input.inputIntegerArray();
        int cin4 = 2;
        List<List<Integer>> result_c = solution_c.highestRankedKItems(cin1, cin2, cin3, cin4);
        System.out.println(result_c);
    }
    public static void runD() {
        com.contest.biweekly.n70.d.Solution solution_d = new com.contest.biweekly.n70.d.Solution();
        String din1 = "PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS";
        int result = solution_d.numberOfWays(din1);
        System.out.println(result);
    }
}
