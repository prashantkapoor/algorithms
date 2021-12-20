package com.leetcode;

import java.util.Arrays;

//370. Range Addition
//1109. Corporate Flight Bookings
public class RangeAddition {
	public int[] getModifiedArray(int length, int[][] updates) {
	    int[] arr=new int[length+1];
	    Arrays.fill(arr,0);
	    
	    for(int passes=0;passes<updates.length;passes++){
	        int start=updates[passes][0];
	        int end=updates[passes][1];
	        int increment=updates[passes][2];
	        
	        arr[start]+=increment;
	        arr[end+1]-=increment;
	    }
	    
	    //do prefix sum
	    int[] result=new int[length];
	    result[0]=arr[0];
	    for(int index=1;index<length;index++){
	        result[index]=arr[index]+result[index-1];
	    }
	    return result;
	}
}
