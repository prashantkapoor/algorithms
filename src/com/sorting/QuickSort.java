package com.sorting;

import java.util.HashMap;
import java.util.Map;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input=new int[] {10,16,8,12,15,11,3,9,5};
		sort(input,0,input.length-1);
		System.out.println(input);
		
	}
	
	public static int[] sort(int[] arr,int low,int high) {
		
		if(low<high) {
			int j=partition(arr,low,high);
			
			sort(arr,low,j-1);
			System.out.println("Test");
			sort(arr,j+1,high);
		}
		
		return arr;
		
	}
	
	public static int partition(int[] arr,int low,int high) {
		int pivotIndex=(low+high)/2;
		int pivot=arr[pivotIndex];
		int left=low;
		int right=high;
		
		while(left<right) {
			while(arr[left]<=pivot){
				left++;
			}
			
			while(arr[right]>pivot) {
				right--;
			}
			
			if(left<right) {
				//swap
				int temp=arr[right];
				arr[right]=arr[left];
				arr[left]=temp;
			}
		}
		int temp=arr[pivotIndex];
		arr[pivotIndex]=arr[right];
		arr[right]=temp;
		
		return right;
		
	}

}
