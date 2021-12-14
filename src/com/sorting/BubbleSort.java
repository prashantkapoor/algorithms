package com.sorting;

//Adoptive: Using swap flag for breaking if there are no swap - it means array is already sorted
public class BubbleSort {

	
	public static int[] sort(int[] array) {
		int arrayLength=array.length;
		//first loop for passes
		//second for comparisons
		for(int passes=1;passes<=arrayLength;passes++) {
			boolean swap=false;
			for(int jIndex=0;jIndex<arrayLength-passes;jIndex++) {
				if(array[jIndex]>array[jIndex+1]) {
					swap=true;
					int temp=array[jIndex];
					array[jIndex]=array[jIndex+1];
					array[jIndex+1]=temp;
				}
			}
			if(swap)
				break;
		}
		return array;
		
	}
}
