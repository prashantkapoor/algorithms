package com.sorting;

public class SelectionSort {

	public static int[] sort(int[] array) {
		//int mover=0;
		//int minElIndex=0;
		int length=array.length;
		int passes=array.length-1;
		int minimum=Integer.MAX_VALUE;
		
		for(int index=0;index<passes;index++) {
			int minElIndex=index;
			int mover=index;
			while(mover<length) {
				if(array[mover]<array[minElIndex]) {
					minElIndex=mover;
				}
				mover++;	
			}
			int swap=array[index];
			array[index]=array[minElIndex];
			array[minElIndex]=swap;
		}
		return array;
	}
}
