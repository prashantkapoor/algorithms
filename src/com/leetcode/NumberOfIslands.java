package com.leetcode;

import java.util.Set;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NumberOfIslands().numIslands(new char[][]{{'1','1','1'},
			  {'0','1','0'},
			  {'1','1','1'},
			  });
	}

public int numIslands(char[][] grid) {
        
        int column=grid[0].length;
        int row=grid.length;
       // Set c=new HashSet();
        int[][] visited=new int[row][column];
        //Arrays.fill(visited,0);
        
        int island=0;
        for(int rowIndex=0;rowIndex<row;rowIndex++){
            for(int columnIndex=0;columnIndex<column;columnIndex++){
                if(visited[rowIndex][columnIndex]==1){
                    continue;
                }
                if(grid[rowIndex][columnIndex]=='1'){
                    island++;
                    visit(grid,visited,rowIndex,columnIndex);
                }
                
            }
        }
        
        return island;
    }
    
    void visit(char[][] grid,int[][] visited,int rowIndex,int columnIndex){
        if(visited[rowIndex][columnIndex]==1){
            return;
        }
        visited[rowIndex][columnIndex]=1;
        if(grid[rowIndex][columnIndex]=='0'){
            visited[rowIndex][columnIndex]=1;
            return;
        }
        if(grid.length>rowIndex+1){
            visit(grid,visited,rowIndex+1,columnIndex);
        }
        if(grid[0].length>columnIndex+1){
            visit(grid,visited,rowIndex,columnIndex+1);
        }
        if(rowIndex-1>=0){
            visit(grid,visited,rowIndex-1,columnIndex);
        }
        if(columnIndex-1>=0){
            visit(grid,visited,rowIndex,columnIndex-1);
        }
    }

}
