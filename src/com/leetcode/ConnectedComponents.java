package com.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ConnectedComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ConnectedComponents().countComponents(5, new int[][]{{0,1},{1,2},{3,4}});
	}
	public int countComponents(int n, int[][] edges) {
        if(n==0||n==1)
            return n;
        //create adjacency matrix
        int totalEdges=edges.length;
        int[][] matrix=new int[n][n];
        
        int[] visited=new int[n];
        Arrays.fill(visited,0);
        
        for(int index=0;index<totalEdges;index++){
            int start=edges[index][0];
            int end=edges[index][1];
            
            matrix[start][end]=1;
            matrix[end][start]=1;
        }
        //visit first node
        Deque<Integer> stackOfNodes=new ArrayDeque<Integer>();
        
        //starting from node 0
        //stackOfNodes.push(0);
        int connections=0;
        for(int currNode=0;currNode<n;currNode++){
            //starting from node 0
            if(visited[currNode]==1){
                continue;
            }
            connections++;
            stackOfNodes.push(currNode);
            while(!stackOfNodes.isEmpty()){
                int curr=stackOfNodes.pop();
                visited[curr]=1;
                for(int index=currNode;index<n;index++){
                    if(matrix[curr][index]==1&&visited[index]!=1){
                        stackOfNodes.push(index);
                    }
                }
            }
        }
        
        
        return connections;
    }

}
