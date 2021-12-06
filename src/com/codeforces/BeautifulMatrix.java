package com.codeforces;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int index=-1;
		int val=0;
		while(val==0){
			val=sc.nextInt();
			index++;
		}
		sc.close();
		int rowMove=Math.abs(index/5-2);
		int columnMove=Math.abs(index%5-2);
		
		System.out.println(rowMove+columnMove);
	}

}
