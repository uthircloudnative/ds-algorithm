/**
 * 
 */
package com.learn.dsalgorithms.recursion;

/**
 * @author Uthiraraj Saminathan
 *
 */
public class RecursiveAdditionOfArray {
	
	public static void main(String[] args){
		   
	     int[] nums = new int[]{10,5,20,40,0}; //75
	   
	     int currentIdx = nums.length-1;
	     
	     System.out.println(sum(nums,currentIdx));
	     
	   
	   }

	   private static int sum(int[] nums, int currentIdx){
	   
	      if(currentIdx == 0){
	         return nums[currentIdx];
	      }else{
	         return nums[currentIdx]+sum(nums,currentIdx-1);
	      }
	   }

}
