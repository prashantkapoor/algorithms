package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinCostConnectSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=new MinCostConnectSolution().connectSticks(new int[] {3354,4316,3259,4904,4598,474,3166,6322,8080,9009});
		System.out.println(i);
	}
	
	 public int connectSticks(int[] sticks) {
	        int totalCost = 0;
	 
	        PriorityQueue<Integer> pq = new PriorityQueue();
	        
	        int[][] visited=new int[2][2];
	        Arrays.fill(visited,0);
	 
	        // add all sticks to the min heap.
	        for (int stick : sticks) {
	            pq.add(stick);
	        }
	 
	        // combine two of the smallest sticks until we are left with just one.
	        while (pq.size() > 1) {
	            int stick1 = pq.remove();
	            int stick2 = pq.remove();
	            
	            int cost = stick1 + stick2;
	            totalCost += cost;
	            
	            pq.add(stick1 + stick2);
	        }
	 
	        return totalCost;
	    }

}
