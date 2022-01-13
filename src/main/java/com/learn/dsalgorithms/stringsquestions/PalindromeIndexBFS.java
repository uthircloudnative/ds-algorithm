/**
 * 
 */
package com.learn.dsalgorithms.stringsquestions;

import java.util.Map;

/**
 * 
 * Given a string of lowercase letters in the range ascii[a-z], 
 * determine the index of a character that can be removed to make the string a palindrome. 
 * There may be more than one solution, but any will do. 
 * If the word is already a palindrome or there is no solution, return -1. Otherwise, 
 * return the index of a character to remove.
 * 
 * 
 * Either remove 'b' at index  or 'c' at index .
 * 
 * @author Uthiraraj Saminathan
 *
 */
public class PalindromeIndexBFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "aaab";
		System.out.println(findPalindromeIndex(s));
	}

	
	private static int findPalindromeIndex(String s) {
		
		//Here the usage of StringBuilder will increase space and time complexity.
		StringBuilder strBuilder = new StringBuilder(s);
	      
	      if(s.equals(strBuilder.reverse().toString())){
	          return -1;
	      }else{
	          
	          for(int i=0; i<s.length();i++){
	          
	            StringBuilder strBuilderLocal = new StringBuilder(s);
	            
	            StringBuilder newBuilder = strBuilderLocal.deleteCharAt(i);
	            
	            if(newBuilder.toString().equals(newBuilder.reverse().toString())){
	                return i;
	            }
	          
	          }
	      }
	      return -1;
		
	}
	
}
