package com.sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input=Input.getLargeInput();
		long startTime=System.currentTimeMillis();
		int[] bubbleSort=BubbleSort.sort(Arrays.copyOf(input, input.length));
		long endTime=System.currentTimeMillis();
		System.out.println("Sorted using Bubble sort, in time: "+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		int[] insertionSort=InsertionSort.sort(Arrays.copyOf(input, input.length));
		endTime=System.currentTimeMillis();
		System.out.println("Sorted using Insertion sort, in time: "+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		int[] selectionSort=SelectionSort.sort(Arrays.copyOf(input, input.length));
		endTime=System.currentTimeMillis();
		System.out.println("Sorted using Selection sort, in time: "+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		int[] heapSort=HeapSort.sort(Arrays.copyOf(input, input.length));
		endTime=System.currentTimeMillis();
		System.out.println("Sorted using Heap sort, in time: "+(endTime-startTime));
		
		
		startTime=System.currentTimeMillis();
		int[] mergeSort=MergeSort.sort(Arrays.copyOf(input, input.length));
		endTime=System.currentTimeMillis();
		System.out.println("Sorted using Merge sort, in time: "+(endTime-startTime));
	}
	
	private void printSortedArray(int[] array) {
		for(int num:array) {
			System.out.print(num+" ");
		}
	}

}
