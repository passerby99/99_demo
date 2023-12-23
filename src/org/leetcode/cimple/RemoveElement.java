package org.leetcode.cimple;

public class RemoveElement {
    // 移除元素
    public int removeElement(int[] nums, int val) {
        int begin = 0, end = nums.length - 1;
        return remove(nums, val, begin, end);
    }

    private int remove(int[] nums, int val, int begin, int end) {
        if (begin < end && nums.length > 1) {
            if (nums[begin] != val && nums[end] == val) {
                return remove(nums, val, begin + 1, end - 1);
            } else if (nums[begin] != val && nums[end] != val) {
                return remove(nums, val, begin + 1, end);

            } else if (nums[begin] == val && nums[end] == val) {
                return remove(nums, val, begin, end - 1);

            } else {
                nums[begin] = nums[end];
                return remove(nums, val, begin + 1, end - 1);
            }

        } else {
            if (nums.length == 0) {
                return 0;
            }
            if (begin == end && nums[begin] == val) {
                return begin;
            } else if (begin > end) {
                return begin;
            } else {
                return begin + 1;
            }
        }

    }
}

