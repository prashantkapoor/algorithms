package com.leetcode;

import java.util.Map;
import java.util.PriorityQueue;

public class KLargestElement {

	public static void main(String[] args) {
		
		PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=
				new PriorityQueue<Map.Entry<Integer,Integer>>((a,b)->b.getValue()-a.getValue());
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,2,1,5,6,4};
		int k = 2;
		kIndex=nums.length-k;
	    new KLargestElement().quickSort(nums,0,nums.length-1);
	    System.out.println(nums[kIndex]);
	}
	
	static int kIndex=0;
    public int findKthLargest(int[] nums, int k) {
        kIndex=nums.length-k;
        
        quickSort(nums,0,nums.length-1);
        
        return nums[kIndex];
    }
    
    
    private void quickSort(int[] nums,int low,int high){
        if(low<high){
            int j=partition(nums,low,high);
            if(j<kIndex){
                //numbers right to j are greater than nums[j]
                quickSort(nums,j+1,high);
            }else if(j>kIndex){
                //position of j is beyond the largest number we need to find
                quickSort(nums,low,j-1);
            }else{
                //number found;
                return;
            }
            
        }
    }
    
    private int partition(int[] nums,int low, int high){
        int pivot=nums[low];
        int left=low;
        int right=high;
        while(left<right){
            while(left<nums.length&&nums[left]<=pivot){
                left++;
            }
            while(nums[right]>pivot){
                right--;
            }
            if(left<right){
                //swap
                swap(nums,left,right);
            }
        }
        //swap, right and pivot
        swap(nums,low,right);
        return right;
    }
    
    void swap(int[] nums,int swap1,int swap2){
        int temp=nums[swap1];
        nums[swap1]=nums[swap2];
        nums[swap2]=temp;
    }

}
