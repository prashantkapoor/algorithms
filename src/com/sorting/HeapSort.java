package com.sorting;


//creating a heap by inserting at the bottom or by using heapify
//removing element 1-1 to get a sorted list
public class HeapSort {

	public static int[] sort(int[] array) {
		
		array=createHeapUsingHeapify(array);
		sortByDeletion(array);
		return array;
	}

	private static int[] createHeapUsingHeapify(int[] array) {
		
		for(int index=array.length-1;index>=0;index--) {
			
			swapTillHeight(array,index,array.length);
			
		}
		
		return array;
	}

	private static void swapTillHeight(int[] array, int index,int arrayLength) {
		// TODO Auto-generated method stub
		int lChildIndex=(index+1)*2-1;
		int rChildIndex=(index+1)*2;
		if(lChildIndex>=arrayLength) {
			return;
		}
		int swapIndex=index;
		if(rChildIndex>=arrayLength) {
			swapIndex=lChildIndex;
		}else {
			swapIndex=array[lChildIndex]>array[rChildIndex]?lChildIndex:rChildIndex;
		}
		if(array[index]<array[swapIndex]) {
			int temp=array[index];
			array[index]=array[swapIndex];
			array[swapIndex]=temp;
			swapTillHeight(array,swapIndex,arrayLength);
		}
	}
	
	private static int[] sortByDeletion(int[] array) {
		int length=array.length;
		int index=length-1;
		while(index>0) {
			int temp=array[index];
			array[index]=array[0];
			array[0]=temp;
			swapTillHeight(array,0,index);
			index--;
		}
		return array;
	}



}
