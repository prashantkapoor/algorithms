package com.leetcode;

//1167. Minimum Cost to Connect Sticks
public class MinCostConnectSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=new MinCostConnectSticks().connectSticks(new int[] {3354,4316,3259,4904,4598,474,3166,6322,8080,9009});
		System.out.println(i);
	}
	
	public int connectSticks(int[] sticks) {
        for(int index=sticks.length-1;index>=0;index--){
            performHeapify(sticks,index,sticks.length-1);
        }
        
        return minCost(sticks);
    }
    
    int minCost(int[] sticks){
        int length=sticks.length;
        int index=1;
        int endIndex=length-1;
        int[] sum=new int[length];
        sum[0]=pickTop(sticks,endIndex);
        endIndex--;
        int totalSum=0;
        while(index<length){
        	int nextMin=pickTop(sticks,endIndex);
            sum[index]=sum[index-1]+nextMin;
            totalSum+=sum[index];
            index++;
            endIndex--;
        }
        
        return totalSum;
        
    }
    
    int pickTop(int[] sticks,int endIndex){
        int num=sticks[0];
        sticks[0]=sticks[endIndex];
        performHeapify(sticks,0,endIndex);
        return num;
    }
    
    void performHeapify(int[] sticks,int index,int endIndex){
        
        int leftC=(index+1)*2-1;
        int rightC=(index+1)*2;
        
        if(leftC>endIndex){
            return;
        }else{
            int swapIndex=-1;
            
            if((rightC>endIndex||sticks[leftC]<sticks[rightC])&&sticks[leftC]<sticks[index]){
                swapIndex=leftC;
            }else if(rightC<=endIndex&&sticks[rightC]<=sticks[leftC]&&sticks[rightC]<sticks[index]){
                swapIndex=rightC;
            }
            if(swapIndex!=-1){
                int temp=sticks[index];
                sticks[index]=sticks[swapIndex];
                sticks[swapIndex]=temp;
                performHeapify(sticks,swapIndex,endIndex);
            }
        }
    }

}
