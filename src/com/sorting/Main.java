package com.sorting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input=new int[] {8,5,7,7,3,2,2};
		long startTime=System.currentTimeMillis();
		int[] bubbleSort=BubbleSort.sort(input);
		long endTime=System.currentTimeMillis();
		System.out.println("Sorted using Bubble sort, in time: "+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		int[] insertionSort=InsertionSort.sort(input);
		endTime=System.currentTimeMillis();
		System.out.println("Sorted using Insertion sort, in time: "+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		int[] selectionSort=SelectionSort.sort(input);
		endTime=System.currentTimeMillis();
		System.out.println("Sorted using Selection sort, in time: "+(endTime-startTime));
	}
	
	private void printSortedArray(int[] array) {
		for(int num:array) {
			System.out.print(num+" ");
		}
	}

}
