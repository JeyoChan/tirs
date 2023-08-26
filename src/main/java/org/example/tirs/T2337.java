package org.example.tirs;

public class T2337 {
    public boolean canChange(String start, String target) {
        int pStart = 0;
        for (int i = 0; i < target.length(); i += 1) {
            if (target.charAt(i) == '_') {
                continue;
            }
            while (pStart < start.length() && start.charAt(pStart) == '_') {
                pStart += 1;
            }
            if (pStart == start.length() || target.charAt(i) != start.charAt(pStart)) {
                return false;
            }
            if (target.charAt(i) == 'L' && pStart < i) {
                return false;
            }
            if (target.charAt(i) == 'R' && pStart > i) {
                return false;
            }
            pStart += 1;
        }
        while (pStart < start.length()) {
            if (start.charAt(pStart) != '_') {
                return false;
            }
            pStart += 1;
        }
        return true;
    }
}
