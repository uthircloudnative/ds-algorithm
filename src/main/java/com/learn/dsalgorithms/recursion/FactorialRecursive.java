/**
 * 
 */
package com.learn.dsalgorithms.recursion;

/**
 * @author Uthiraraj Saminathan
 *
 */
public class FactorialRecursive {

	public static void main(String[] args){
		  
	     int n = 5;
	     
	     int value = factByLoop(n);
	     int recValue = factByRecursive(n);
	     System.out.println(value);
	     System.out.println(recValue);
	  }
	 
	  private static int factByLoop(int n){
	  int total = 0;
	   while(n>1){
	     if(total == 0)
	       total = n*(n-1);
	    else
	       total = total * (n-1);
	       
	     n--;
	   }
	    return total;
	  }
	  
	  /***
	  * This Recursive logic is based on Divide and Conquer method.
	  * Here we spilt the multiplication problem into 5 step small problem
	  * and calculated the final result.
	  ***/
	  private static int factByRecursive(int n){
	  
	     //5*4*3*2*1
	     
	     if(n == 1){
	        return n;
	     }else{
	        //5 * factByRecursive(4) --> 24 * 5 = 120
	        //4 * factByRecursive(3) --> 6 * 4 = 24
	        //3 * factByRecursive(2) --> 2 * 3 = 6
	        //2 * factByRecursive(1) --> 2 * 1 = 2
	        //1 * function return 1 --> control go to next stack 2*1 -->2 3*2
	        return n*factByRecursive(n-1);
	     }
	  }
}
