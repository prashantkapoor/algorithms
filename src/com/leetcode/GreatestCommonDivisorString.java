package com.leetcode;

public class GreatestCommonDivisorString {

	public static void main(String[] args) {
		//"ABABAB"
		//"ABAB"
		gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");

	}
	
	public static String gcdOfStrings(String str1, String str2) {
        if(str1.length()==str2.length()){
            if(str1.equals(str2)){
            return str1;
            }else{
                return "";
            }
        }
        
        String larger=str1.length()>str2.length()?new String(str1):new String(str2);
        String smaller=str1.length()<str2.length()?new String(str1):new String(str2);
        
        int largerLength=larger.length();
        int smallerLength=smaller.length();
        int index=0;
        for(index=0;index<largerLength;index++){
            if(larger.charAt(index)==smaller.charAt(index%smallerLength)){
                //
            }else{
                return "";
            }
        }
        
        return smaller.substring(0,gcd(largerLength,smallerLength));
    }
    
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
          
        return gcd(b%a, a);
    }

}
