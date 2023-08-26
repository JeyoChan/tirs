package org.example.tirs;

import java.util.HashMap;
import java.util.Map;

public class TLCR011 {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        firstIndex.put(0, -1);
        int res = 0, zeroCnt = 0;
        for (int i = 0; i < nums.length; i += 1) {
            zeroCnt += nums[i] == 0 ? 1 : -1;
            if (firstIndex.containsKey(zeroCnt)) {
                res = Math.max(res, i - firstIndex.get(zeroCnt));
            } else {
                firstIndex.put(zeroCnt, i);
            }
        }
        return res;
    }
}
