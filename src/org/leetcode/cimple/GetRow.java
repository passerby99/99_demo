package org.leetcode.cimple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//杨辉三角II
public class GetRow {
    private List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> newList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    newList.add(1);
                } else if (i >= 2) {
                    newList.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
                }
            }
            list.add(newList);
        }
    return list.get(rowIndex);
    }
    @Test
    public void test() {
        int numRows = 1;
        System.out.println(getRow(numRows));
    }
}
