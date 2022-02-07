package com.leetcode;

import java.util.PriorityQueue;

public class KnearestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new KnearestPoint().kClosest(new int[][] {{2,10},{-9,-9},{0,8},{-2,-2},{8,9},{-10,-7},{-5,2},{-4,-9}}, 7);
	}
	
public int[][] kClosest(int[][] points, int k) {
        
        int totalPoints=points.length;
        
        int[][] mem=new int[totalPoints][2];
        
        PriorityQueue<int[]> minHeap=new PriorityQueue<int[]>((int[] a,int[] b)->a[1]-b[1]);
        
        for(int index=0;index<totalPoints;index++){
            int x=points[index][0];
            int y=points[index][1];
            int area=getSquare(x,y);
            int[] store=new int[]{index,area};
            minHeap.offer(store);
        }
        
        int index=0;
        while(index<k){
            int[] min=minHeap.poll();
            mem[index][0]=points[min[0]][0];
            mem[index][1]=points[min[0]][1];
            index++;
        }
        
        return mem;
    }
    
    int getSquare(int x,int y){
    	double x2=(double)Math.pow(x,2);
    	double y2=(double)Math.pow(y,2);
    	double area=Math.sqrt(x2+y2);
    	
    	int iArea=(int)area;
        return iArea;
    }

}
