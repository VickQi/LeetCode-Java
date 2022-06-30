package tech.qihaizhi.leetcode;

public class Solution {
    public int[] runningSum(int[] nums){
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i>0){
                output[i] = output[i-1] + nums[i];
            }else{
                output[i] = nums[i];
            }
        }
        return output;
    }
}
