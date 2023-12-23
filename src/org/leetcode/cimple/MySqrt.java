package org.leetcode.cimple;

public class MySqrt {
    public int mySqrt(int x) {
        int h = 0, e = x, asn = -1;
        while (h <= e) {
            int mid = (h + e) / 2;
            if (mid * mid <= x) {
                asn = mid;
                h = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return asn;
    }
}
