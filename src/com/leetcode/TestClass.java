package com.leetcode;

public class TestClass {

	public static void main(String[] args) {
		
		new TestClass().getHash(new int[] {1,2,3,2,1,4,5,6,66,4,3,7,5,23,56,64}, 0, 15);

	}
	
	
	public int getHash(int[] arr,int start,int end){
        int length=end-start;
        int index=0;
        int hashValue=0;
        
        while(index+start<=end){
            int val=(int) (arr[index+start]*Math.pow(10,index)%Math.pow(2,31));
            hashValue=(int) ((hashValue+val)%Math.pow(2,31));
            index++;
        }
        return hashValue;
    }

}
