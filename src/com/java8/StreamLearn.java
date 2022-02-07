package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLearn {

	public static void main(String[] args) {
		List<String> nlist=Arrays.asList("Prashant","Nipun","Karan");
		
		List<String> nL=nlist.stream().filter(n->n.startsWith("P")).collect(Collectors.toList());
		
		nL.forEach((n)->System.out.println(n));
		
		
		
		int bal=1<<1;
		System.out.println(1<<0);
		System.out.println(-5>>>1);
		System.out.println(-5>>1);
		for(int index=0;index<5;index++) {
			bal+=1<<bal;
			System.out.println(bal);
		}
		
		//System.out.println();
		new StreamLearn().scoreOfParentheses("((()())())");

	}
	
	public int scoreOfParentheses(String S) {
        int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
                if (S.charAt(i-1) == '(')
                    ans += 1 << bal;
            }
        }

        return ans;
    }

}
