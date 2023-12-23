package org.leetcode.cimple;

public class RemoveDuplicates {
    private int size = 1;
    private int begins =0;
    private int ends = 1;
    // 删除有序数组中的重复项
    public int removeDuplicates(int[] nums) {
        return removeDuplicate(nums,begins,ends);
    }

    private int removeDuplicate(int[] nums, int begin,int end) {
        if(end < nums.length && begin <= end){
            if(nums[begin] == nums[end]) {
                removeDuplicate(nums, begin, end + 1);
            } else if(nums[begin] != nums[end]){
                nums[begin + 1] = nums[end];
                size++;
                removeDuplicate(nums,begin + 1, end + 1);
            }
        }
        return size;
    }
}
