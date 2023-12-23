package org.leetcode.cimple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

// 杨辉三角
public class Generate {
    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list2 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list2.add(1);
                }
                if (j > 0 && j < i) {
                    list2.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
                }

            }
            list.add(i, list2);
        }
        return list;

    }

    @Test
    public void test() {
        int numRows = 1;
        System.out.println(generate(numRows));
    }
}
