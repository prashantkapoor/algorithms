package com.leetcode;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maxSubArray(new int[]{1,2,-1,-2,2,1,-2,1,4,-5,4});
	}

	
public static int maxSubArray(int[] nums) {
		int globalMax,localMax=1;
        int left=0, right=nums.length-1;
        int maxSum=0;
        for(int num:nums){
            maxSum+=num;
        }
        int sum=maxSum;
        while(left<right){
        	int sumRemovingLeft=sum-nums[left];
        	int sumRemovingRight=sum-nums[right];
        	
            if(sumRemovingLeft>sumRemovingRight){
                maxSum=Math.max(maxSum,sumRemovingLeft);
                sum=sumRemovingLeft;
                left++;
            }else{
                maxSum=Math.max(maxSum,sumRemovingRight);
                sum=sumRemovingRight;
                right--;
            }
        }
        return maxSum;
    }
    
}
