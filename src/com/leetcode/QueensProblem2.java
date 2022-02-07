package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class QueensProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	int totalSolutions=0;
    public int totalNQueens(int n) {
        
        Set<Integer> columns=new HashSet<Integer>();
        Set<Integer> diagonals=new HashSet<Integer>();
        Set<Integer> antiDiagonals=new HashSet<Integer>();
        
        backtrack(0,columns,diagonals,antiDiagonals,n);
        
        return totalSolutions;
    }
    
    public void backtrack(int row, Set<Integer> columns,Set<Integer> diagonals,Set<Integer> antiDiagonals, int size){
        
        if(size==row){
            totalSolutions+=1;
            return;
        }
        for(int column=0;column<size;column++){
            int diagonal=row-column;
            int antiDiagonal=row+column;
            if(columns.contains(column)||diagonals.contains(diagonal)||antiDiagonals.contains(antiDiagonal)){
                continue;
            }
            columns.add(column);
            diagonals.add(diagonal);
            antiDiagonals.add(antiDiagonal);
            
            backtrack(row+1,columns,diagonals,antiDiagonals,size);
            
            columns.remove(column);
            diagonals.remove(diagonal);
            antiDiagonals.remove(antiDiagonal);
            
        }
        return;
    }

}
