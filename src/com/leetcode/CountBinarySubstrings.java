package com.leetcode;

import java.util.Arrays;

public class CountBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countBinarySubstrings("00110011");
	}
	
	public static int countBinarySubstrings(String s) {
        String[] arr=s.split("");
        int[] freq=new int[arr.length+1];
        Arrays.fill(freq,-1);
        int index=1;
        String k=arr[0];
        int localFreq=1;
        int localIndex=0;
        while(index<arr.length){
            if(k.equals(arr[index])){
                localFreq++;
            }else{
                k=arr[index];
                freq[localIndex]=localFreq;
                localIndex++;
                localFreq=1;
            }
            index++;
        }
        freq[localIndex]=localFreq;
        
        index=1;
        int count=0;
        while(freq[index]>0){
            count+=Math.min(freq[index-1],freq[index]);
            index++;
        }
        
        return count;
        
    }

}
