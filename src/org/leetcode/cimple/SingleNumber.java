package org.leetcode.cimple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

// 出现一次的数字
public class SingleNumber {
    private int singleNumber(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list1.contains(nums[i])) {
                list1.add(nums[i]);
            } else if(!list2.contains(nums[i])){
                list2.add(nums[i]);
            }
        }
        for(int j = 0; j < list2.size(); j++) {
           if(!list2.contains(list1.get(j))) {
               return list1.get(j);
           }
        }
        return list1.get(list1.size() - 1);
    }

    @Test
    public void test() {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }
}
