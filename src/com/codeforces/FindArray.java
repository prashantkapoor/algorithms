package com.codeforces;

import java.util.Scanner;

public class FindArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		
		int index=0;
		//int[] arr=new int[testCases];
		while(index<testCases) {
			int num=sc.nextInt();
			System.out.println();
			generateNumbers(num);
			index++;
		}
		
		//(x)+1
		
	}
	
	private static void generateNumbers(int n) {
		int number=1;
		while(n>0) {
			number=number+1;
			System.out.print(number+ " ");
			
			n--;
		}
	}

}
