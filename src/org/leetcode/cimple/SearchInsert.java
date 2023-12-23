package org.leetcode.cimple;

public class SearchInsert {
    public int  searchInsert(int[] nums, int target) {
        return search(nums,0,nums.length - 1,target);
    }
    private int search(int[] nums, int head, int end, int target) {
        if(head > end) {
            return head;
        }
        int mid = (head + end) / 2;
        if(nums[mid] < target) {
            return search(nums, mid + 1, end, target);
        }
        else if(nums[mid] > target) {
            return search(nums, head, mid - 1,target);
        }else {
            return mid;
        }

    }
}
