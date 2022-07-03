package tech.qihaizhi.leetcode;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int shouldSum = n*(n-1)/2;
        int actualSum = 0;
        for(int i:nums){
            actualSum += nums[i];
        }
        return shouldSum - actualSum;
    }
}
