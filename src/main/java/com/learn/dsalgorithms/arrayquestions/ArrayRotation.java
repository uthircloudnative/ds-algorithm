/**
 * 
 */
package com.learn.dsalgorithms.arrayquestions;

/**
 * @author Uthiraraj Saminathan
 *
 */
public class ArrayRotation {

	public static void main(String[] args) {
		
		int[] A = new int[] {};
		int K = 1;
		rotateArr(A,K);
	}
	
		private static int[] rotateArr(int[] A,int K) {
			
			System.out.println(A.length);
			if(A == null || A.length == 0 ) {
				return null;
			}
			
			if(K==0 && A.length > 0) {
				return A;
			}
			
			if(K > 0) {
				int i = 0;
				 while(i < K){
			        	int[] temp = new int[A.length];
			          int lastValue = A[A.length-1];
			          int k = 0;
			          for(int j=0; j<A.length-1; j++){
			              k++;
			              temp[k] = A[j];
			          }
			          temp[0] = lastValue;
			          A = temp;
			          i++;
			        }
			       
			       for(int j=0; j<A.length;j++){
			        System.out.println(A[j]);
			       }
			}
			
//			if(A.length%K == 0){
//				//System.out.println("");
//		        return A;
//		    }else{
//	
//		        int itCount = A.length%K;
//		        
//		        int i = 0;
//		        
//		        while(i <= itCount){
//		        	int[] temp = new int[A.length];
//		          int lastValue = A[A.length-1];
//		          int k = 0;
//		          for(int j=0; j<A.length-1; j++){
//		              k++;
//		              temp[k] = A[j];
//		          }
//		          temp[0] = lastValue;
//		          A = temp;
//		          i++;
//		        }
//		       
//		       for(int j=0; j<A.length;j++){
//		        System.out.println(A[j]);
//		       }
//		    }
			
			return A;
			
		}
	
}
