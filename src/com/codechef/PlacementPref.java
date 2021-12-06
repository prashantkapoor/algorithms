package com.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PlacementPref {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		int totalCases=2;
		try {
			totalCases=Integer.parseInt(r.readLine());
		}catch(Exception e) {
			//
		}
		
		String[][] companiesL=new String[totalCases][2];
		String[][] selectedL=new String[totalCases][2];
		
		int index=0;
		while(index<totalCases) {
			
			String companies=r.readLine();
			String[] compArr=companies.split(" ");
			companiesL[index][0]=compArr[0];
			companiesL[index][1]=compArr[1];
			
			String selected=r.readLine();
			String[] selArr=selected.split(" ");
			selectedL[index][0]=selArr[0];
			selectedL[index][1]=selArr[1];
			//resultList.add(acceptOfferFrom(companiesL[index],selectedL[index]));
			index++;
		}
		index=0;
		while(index<totalCases) {
			acceptOfferFrom(companiesL[index],selectedL[index]);
			index++;
		}
		
	}
	
	private static void acceptOfferFrom(String[] comp,String[] pref) {
		int index=0;
		String result=new String();
		while(index<2) {
			if(pref[index].equals(comp[0])) {
				result=pref[index];
				break;
			}else if(pref[index].equals(comp[1])){
				result=pref[index];
			}
			index++;
		}
		
		System.out.println(result);
	}

}

