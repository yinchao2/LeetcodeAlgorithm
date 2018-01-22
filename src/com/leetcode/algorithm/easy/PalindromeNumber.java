package com.leetcode.algorithm.easy;

/**
 * 
 * 	@author Yin
 *	
 *	9. Palindrome Number
 *
 *	Determine whether an integer is a palindrome. Do this without extra space.
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPalidromeNumber(9));
		
		System.out.println(isPalidromeNumber(123474321));
		System.out.println(isPalidromeNumber(-12344321));
		System.out.println(isPalidromeNumber(12344321));
		
		System.out.println(isPalidromeNumber("avccba"));
		System.out.println(isPalidromeNumber("abccba"));
		System.out.println(isPalidromeNumber("abctcba"));
	}
	
	public static boolean isPalidromeNumber(int x) {
		
		if(x < 0 || x < 10) return false;
		
		if(reverseInteger(x) == x) {
			return true;
		}
		return false;
	}
	
	public static int reverseInteger(int x) {
		
		int result = 0;
		
		while(x != 0) {
			result = (result*10) + (x%10);
			x = x/10;
		}	 
		return result;
	}
	
	public static boolean isPalidromeNumber(String x) {
		
		int i = 0;
		int j = x.length() - 1;
		
		while(i < j) {
			
			if(x.charAt(i) != x.charAt(j)) {
				return false;
			}
			i++;
			j--;	
		}	  
		return true;
	}
}
