package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=lengthOfLongestSubstringSolution("aab");
	}
	
	public static int lengthOfLongestSubstring(String s) {
        Map<String,Integer> mem=new HashMap<String,Integer>();
        String[] str=s.split("");
        int maxLength=0;
        int tempLength=0;
        for(int index=0;index<s.length();index++){
            
            if(mem.containsKey(str[index])){
                index=mem.get(str[index]);
                mem=new HashMap<String,Integer>();
                maxLength=Math.max(maxLength,tempLength);
                tempLength=0;
            }else{
                mem.put(str[index],index);
                tempLength++;
            }
        }
        return Math.max(maxLength,tempLength);
    }
	
	public static int lengthOfLongestSubstringSolution(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}
