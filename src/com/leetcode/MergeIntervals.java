package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MergeIntervals {

	public static void main(String[] args) {
		new MergeIntervals().merge(new int[][] {
{1,3},{2,6},{8,10},{15,18}});
		StringBuffer buf=new StringBuffer();
		

	}
	
	 public int[][] merge(int[][] intervals) {
	        //Create a min heap
		 Arrays.sort(intervals, ((int[] a,int[] b)->a[0]-b[0]));
	        PriorityQueue<int[]> queue=new PriorityQueue<int[]>
	        ((int[] a,int[] b)->a[0]-b[0]);
	        
	        for(int[] inte:intervals) {
				queue.add(inte);
			}
	        LinkedList<int[]> res=new LinkedList<>();
	        //int[][] res=new int[intervals.length][2];
	        
	        int[] val=queue.remove();
	        int start=val[0];
	        int end=val[1];
	        int index=0;
	        while(!queue.isEmpty()){
	            val=queue.remove();
	            if(end<val[0]){
	                int[] store=new int[]{start,end};
	                res.add(store);
	                index++;
	                start=val[0];
	                end=val[1];
	            }else if(val[0]<end){
	                if(end<val[1]){
	                    end=val[1];
	                }
	            }
	        }
	        int[] store=new int[]{start,end};
            res.add(store);

	       // int[][] resultArr=res.toArray(new int[res.size()]);
	        
	        return res.toArray(new int[res.size()][]);
	        
	    }

}

