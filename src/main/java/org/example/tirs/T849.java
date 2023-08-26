package org.example.tirs;

public class T849 {
    public int maxDistToClosest(int[] seats) {
        int i = 0;
        while (i < seats.length && seats[i] == 0) {
            i += 1;
        }
        int res = i, maxLen = 0, len = 0;
        while (i < seats.length) {
            if (seats[i] == 1) {
                maxLen = Math.max(maxLen, len);
                len = 0;
            } else {
                len += 1;
                maxLen = Math.max(maxLen, len);
            }
            i += 1;
        }
        res = Math.max(res, (maxLen + 1) / 2);
        if (seats[seats.length - 1] == 0) {
            res = Math.max(res, len);
        }
        return res;
    }
}