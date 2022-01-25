package com.contest.biweekly.n70.d;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numberOfWays(String corridor) {
        long mod = (long) 1e9 + 7;
        int seatcount = 0;
        for (char c : corridor.toCharArray())
            if (c == 'S')
                seatcount++;
        if (seatcount % 2 == 1 || seatcount == 0)
            return 0;
        List<Long> list = new ArrayList<>();
        boolean s = false;
        int lastSeatIndex = corridor.indexOf('S');
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                if (s) {
                    lastSeatIndex = i;
                } else {
                    list.add((long) i - lastSeatIndex);
                }
                s = !s;
            }
        }
        long ans = 1;
        for (long val : list) {
            if (val == 0)
                continue;
            ans = (ans * val) % mod;
        }
        return (int) (ans % mod);
    }
}
