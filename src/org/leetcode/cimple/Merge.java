package org.leetcode.cimple;

import java.util.Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
        for (int e:
             nums1) {
            System.out.print(e);

        }

    }
}
