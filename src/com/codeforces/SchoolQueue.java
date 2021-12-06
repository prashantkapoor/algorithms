package com.codeforces;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class SchoolQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] inputP=reader.readLine().split(" ");
		int totalPupil=Integer.parseInt(inputP[0]);
		int swaps=Integer.parseInt(inputP[1]);
		
		String queue=reader.readLine();
		char[] queueArr=queue.toCharArray();
		
		int swapIndex=0;
		while(swapIndex<swaps) {
			int pupilIndex=0;
			int boyI=-1;
			int girlI=-1;
			while(pupilIndex<totalPupil) {
				if(queueArr[pupilIndex]=='B') {
					boyI=pupilIndex;
				}else if(queueArr[pupilIndex]=='G') {
					girlI=pupilIndex;
					if(boyI==pupilIndex-1&&boyI!=-1) {
						//swap
						queueArr[boyI]='G';
						queueArr[girlI]='B';
						//
						boyI=girlI=-1;
					}
				}
				pupilIndex++;
			}
			swapIndex++;
		}
		
		System.out.println(new String(queueArr));
		
	}

}
