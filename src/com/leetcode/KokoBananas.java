package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KokoBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new KokoBananas().minEatingSpeed(new int[] {30,11,23,4,20}, 6);
	}
	
	public int minEatingSpeed(int[] piles, int h) {
        int pileLength=piles.length;
        List<Integer> pilList=Arrays.stream(piles).boxed().collect(Collectors.toList());
        
        Collections.sort(pilList,(a,b)->b-a);
        
        //PriorityQueue<Integer> maxPile=new PriorityQueue<Integer>((a,b)->b-a);
        
        int sum=0;
        int max=-1;
        for(Integer pile:pilList){
            max=Math.max(max,pile);
            sum+=pile;
        }
        if(pileLength==h){
            //return max bananas in the pile
            return max;
        }
        
        
        //speed k>=sum of piles/h; start with this k
        //int v=sum/h;
        int k=(int)Math.ceil((double)sum/h);
        int returnSpeed=k;
        
        while(k<max){
            int minSpeed=(k+max)/2;
            
            int hrsNeeded=0;
            for(int index=0;index<pilList.size();index++){
                hrsNeeded+=(int)Math.ceil((double)pilList.get(index)/minSpeed);
            }
            if(hrsNeeded<=h){
                returnSpeed=minSpeed;
                max=minSpeed;
            }if(hrsNeeded>h){
                k=minSpeed+1;
            }
        }
        
        return returnSpeed;
    }
}
