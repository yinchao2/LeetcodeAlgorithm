package com.leetcode.algorithm.easy;

/**
 * 
 * @author Yin
 * 
 * 7. Reverse Integer
 * 
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123
 * Output:  321
 * 
 * Example 2:
 * 
 * Input: -123
 * Output: -321
 * 
 * Example 3:
 * 
 * Input: 120
 * Output: 21
 */
public class ReverseInteger {

	public static void main(String[] args) {	
		System.out.println(reverseInteger(-120));
	}
	
	public static int reverseInteger(int x) {
		
		int result = 0;
		
		while(x != 0) {
			result = (result * 10) + (x%10);
			x = x/10;
		}
		return result;
	}
	
	/*
	public static int reverseInteger(int x) {
		 
		StringBuilder sb = new StringBuilder();
		
		if(x < 0) {
			x = x*(-1);
			sb.append("-");
		}
		
		if(x < 10) {
			return x;
		}
		
		while(x != 0) {
			sb.append(x%10);
			x = x/10;
		}
		
		return Integer.parseInt(sb.toString());
	}
	*/
}
