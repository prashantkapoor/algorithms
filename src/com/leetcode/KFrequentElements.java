package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new KFrequentElements().topKFrequent(new int[] {1,1,1,2,2,3}, 2);
	}
	
	public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mem=new HashMap<Integer,Integer>();
        
        for(int index=0;index<nums.length;index++){
            if(mem.containsKey(nums[index])){
                int count=mem.get(nums[index]);
                count++;
                mem.put(nums[index],count);
            }else{
                mem.put(nums[index],1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=
				new PriorityQueue<Map.Entry<Integer,Integer>>((a,b)->a.getValue()-b.getValue());
        
        for(Map.Entry<Integer,Integer> bucket:mem.entrySet()){
            maxHeap.offer(bucket);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int[] result=new int[k];
        int index=0;
        while(!maxHeap.isEmpty()){
            Map.Entry<Integer,Integer> e=maxHeap.poll();
            result[index]=e.getKey();
            index++;
        }
        
        return result;
    }

}
