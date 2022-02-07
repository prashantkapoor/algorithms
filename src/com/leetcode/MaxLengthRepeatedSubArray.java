package com.leetcode;

public class MaxLengthRepeatedSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MaxLengthRepeatedSubArray().findLength( new int[] {1,2,3,2,1},new int[] {3,2,1,4,7});
	}
	
	int globalMax=0;
    public int findLength(int[] nums1, int[] nums2) {
       
    	
        
        int num1L=nums1.length;
        int num2L=nums2.length;
        
        int[][] store=new int[num1L][num2L];
        
        //start from 0,0
        //num1 in row, and nums2 in column
        dp(store,0,0,nums1,nums2);
        
        System.out.println(globalMax);
        return globalMax;
    }
    
    private void dp(int[][] store,int row, int column,int[] nums1,int[] nums2){
        if(row==nums1.length||column==nums2.length){
            return;
        }
        if(store[row][column]==-1||store[row][column]>0){
            //already visited
            return;
        }
        if(nums1[row]==nums2[column]){
            if(row>0&&column>0){
            	int storeVal=store[row-1][column-1];
            	if(row<nums1.length-1&&column<nums2.length-1) {
            		storeVal=Math.max(store[row-1][column-1],store[row+1][column+1]);
            	}
                store[row][column]=storeVal+1;
            }else{
                store[row][column]=1;
            }
            globalMax=Math.max(store[row][column],globalMax);
            dp(store,row+1,column+1,nums1,nums2);
        }else{
            store[row][column]=-1;
        }
        dp(store,row,column+1,nums1,nums2);
        dp(store,row+1,column,nums1,nums2);
    }

}
