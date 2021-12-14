package com.sorting;

public class InsertionSort {
	
	public static int[] sort(int[] array) {
		
		int passes=array.length-1;
		
		for(int index=1;index<passes;index++) {
			for(int jIndex=index;jIndex>0;jIndex--) {
				if(array[jIndex]<array[jIndex-1]) {
					int swap=array[jIndex];
					array[jIndex]=array[jIndex-1];
					array[jIndex-1]=swap;
				}else {
					break;
				}
			}
		}
		return array;
	}

}
