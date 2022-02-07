package com.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {

	public static void main(String[] args) {

		new KClosestPoints().kClosest(new int[][] {{6,10},{-3,-3},{-2,5},{0,2}},3);
		
		PriorityQueue<int[]> minHeap=new 
				PriorityQueue<int[]>((int[] a,int[] b)->a[1]-b[1]);
	}

	public int[][] kClosest(int[][] points, int k) {

		double[] distance = new double[points.length];
		for (int index = 0; index < points.length; index++) {
			int sq1 = points[index][0] * points[index][0];
			int sq2 = points[index][1] * points[index][1];
			distance[index] = Math.sqrt(sq1 + sq2);
		}

		// find k minimum
		int[] included = new int[points.length];
		Arrays.fill(included, 0);

		int[][] returnArray = new int[k][2];
		for (int j = 0; j < k; j++) {
			double minimum = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int m = 0; m < points.length; m++) {
				if (distance[m] < minimum && included[m] == 0) {
					minimum = distance[m];
					minIndex = m;
					
				}
			}
			included[minIndex] = 1;
			// found min
			returnArray[j][0] = points[minIndex][0];
			returnArray[j][1] = points[minIndex][1];
		}

		return returnArray;
	}

}
