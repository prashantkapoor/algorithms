package com.leetcode;

public class SortColors {
//75. Sort Colors
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortColors(new int[]{21,13,14,31,23,26,67,98,56,43,44,44,55,4356,2,1,1,0});
	}
	
	public static void sortColors(int[] nums) {
        int length=nums.length;
        nums=divide(nums,0,length-1);
        System.out.println(nums);
        
        
    }
    
    private static int[] divide(int[] nums,int l, int r){
        int middle=(l+r)/2;
        if(l==r){
            return new int[]{nums[l]};
        }
        int[] left=divide(nums,l,middle);
        int[] right=divide(nums,middle+1,r);
        
        int[] merged=mergeArray(left,right);
        return merged;
    }
    
    private static int[] mergeArray(int[] leftArr,int[] rightArr){
        int leftIndex=0;
        int leftLength=leftArr.length;
        int rightIndex=0;
        int rightLength=rightArr.length;
        
        int[] resultArray=new int[leftLength+rightLength];
        int index=0;
        while(leftIndex<leftLength||rightIndex<rightLength){
            if(leftIndex==leftLength){
                //fill right
                resultArray[index]=rightArr[rightIndex];
                rightIndex++;
            }else if(rightIndex==rightLength){
                //fill left
                resultArray[index]=leftArr[leftIndex];
                leftIndex++; 
            }else if(leftArr[leftIndex]>rightArr[rightIndex]){
                resultArray[index]=rightArr[rightIndex];
                rightIndex++;
            }else{
               resultArray[index]=leftArr[leftIndex];
               leftIndex++; 
            }
            
            
            index++;
        }
        return resultArray;
    }

}
