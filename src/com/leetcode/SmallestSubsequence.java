package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class SmallestSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new SmallestSubsequence().smallestSubsequence("cbacdcbc"));
	}
	
	
public String smallestSubsequence(String s) {
        
        char[] arr=s.toCharArray();
        
        //stores last occurrence
        Map<Character,Integer> mem=new HashMap<Character,Integer>();
        
        //stores if character is added in result
        Set<Character> included=new HashSet<Character>();
        
        //Stack to maintain order and perform comparisons
        Stack<Character> result=new Stack<Character>();
        
        for(int index=0;index<arr.length;index++){
            mem.put(arr[index],index);
        }
        
        for(int index=0;index<arr.length;index++){
        	if(included.contains(arr[index])){
                continue;
            }
            while(!result.isEmpty()){
                if(result.peek()>arr[index]&&mem.get(result.peek())>index){
                    //pop
                    included.remove(result.peek());
                    result.pop();
                }else{
                    break;
                }
            }
            result.push(arr[index]);
            included.add(arr[index]);
        }
        
        //store stack values in string
        StringBuffer str=new StringBuffer();
        for(Character ch:result){
            str.append(ch);
        }
        
        return str.toString();
    }
	 
}