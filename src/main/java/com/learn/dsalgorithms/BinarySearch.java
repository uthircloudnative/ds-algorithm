/**
 * 
 */
package com.learn.dsalgorithms;

/**
 * @author Uthiraraj Saminathan
 *
 */
public class BinarySearch {

	public static void main(String[] args){
		 
		   //Unsorted Array
		   int[] arr = new int[]{11,4,6,7,8,9,10};
		   
		   //For Binary Search Array must be sorted.
		   Arrays.sort(arr);
		   
		   int start = 0;
		   int end   = arr.length-1;
		   int searchVal = 11;
		   
		   binarySearchRecursive(arr,searchVal,start,end);
		   
		   int midIndex = (start+end)/2;
		   
		   while(start<=end){
		   
		      if(arr[midIndex] == searchVal){
		      System.out.println("Search Value at :"+midIndex);
		         break;
		      }
		      else if(arr[midIndex]< searchVal)
		         start = midIndex+1;
		      else
		         end =  midIndex-1;
		         
		         midIndex = (start+end)/2;
		   
		   }
		   
		   if(start>end){
		     System.out.println("Search Value Not Found :");
		   }
		 
		 }
}
