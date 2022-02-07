package com.leetcode;

public class MergeStoneCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MergeStoneCost().mergeStones(new int[] {3,2,4,1},2);
	}
	
public int mergeStones(int[] stones, int k) {
        
        int globalSum=0;
        int length=stones.length;
        while(length>1){
            if(length<k){
                return -1;
            }
            int[] minStore=getMinValue(stones,k,length);
            int startIndex=minStore[1];
            stones[startIndex]=minStore[0];
            globalSum+=stones[startIndex];
            //shift array by k;
            for(int index=startIndex+1;index<=length-k;index++){
                stones[index]=stones[index+k-1];
            }
            length=length-k+1;
        }
        return globalSum;
        
        
    }
    
    int[] getMinValue(int[] stones,int k,int length){
        int[] minStore=new int[3];
        
        int pileLength=length;
        
        int minSum=0;
        for(int j=0;j<k;j++){
           minSum+=stones[j]; 
        }
        minStore[0]=minSum;
        minStore[1]=0;
        minStore[2]=k-1;
        
        int startIndex=1;
        //k-1
        int endIndex=k;
        int tempSum=minSum;
        while(endIndex<pileLength){
            tempSum=tempSum-stones[startIndex-1]+stones[endIndex];
            if(tempSum<minSum){
                minSum=tempSum;
                minStore[0]=minSum;
                minStore[1]=startIndex;
                minStore[2]=endIndex;
            }
                
                
            startIndex++;
            endIndex++;
        }
        return minStore;
    }

}
