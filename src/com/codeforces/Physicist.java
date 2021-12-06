package com.codeforces;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Physicist {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));	
		int totalForces=Integer.parseInt(reader.readLine());
		
		int[] forceResult=new int[3];
		int index=0;
		while(index<totalForces) {
			String force=reader.readLine();
			String[] forceArr=force.split(" ");
			forceResult[0]=forceResult[0] + (Integer.parseInt(forceArr[0])); 
			forceResult[1]=forceResult[1] + (Integer.parseInt(forceArr[1])); 
			forceResult[2]=forceResult[2] + (Integer.parseInt(forceArr[2])); 
			index++;
		}
		if(forceResult[0]==0&&forceResult[1]==0&&forceResult[2]==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
