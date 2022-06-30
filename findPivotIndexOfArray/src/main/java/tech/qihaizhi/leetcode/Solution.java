package tech.qihaizhi.leetcode;

public class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightSum -= nums[i];
            if(i>0){
                leftSum += nums[i-1];
            }
            if(leftSum==rightSum){
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }
}
