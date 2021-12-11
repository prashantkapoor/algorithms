package com.codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
//977B - Two-gram
public class TwoGram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int stringlength=Integer.parseInt(reader.readLine());
		char[] ch=reader.readLine().toCharArray();
		
		Map<String,Integer> mem=new HashMap<String,Integer>();
		int index=0;
		String maxGram="";
		int frequency=0;
		while(index<stringlength-1) {
			//int nextIndex=index+1;
			String temp=new String(ch, index, 2);
			if(maxGram.isEmpty()) {
				maxGram=temp;
			}
			if(mem.containsKey(temp)) {
				int count=mem.get(temp)+1;
				if(count>frequency) {
					maxGram=temp;
					frequency=count;
				}
				mem.put(temp, count);
			}else {
				mem.put(temp, 1);
			}
			index++;
			
		}
		
		System.out.println(maxGram);
	}

}
