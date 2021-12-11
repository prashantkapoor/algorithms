package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] n=new int[][] {{0,1},{0,2},{1,2}};
		NetworkConnection.makeConnected(4, n);
	}

    public static int makeConnected(int vertices, int[][] connections) {
        int[] visited=new int[vertices];
        int[] parent=new int[vertices];
        Arrays.fill(parent,-1);
        
        int edges=connections.length;
        
        
        
        return 0;
    }
}
