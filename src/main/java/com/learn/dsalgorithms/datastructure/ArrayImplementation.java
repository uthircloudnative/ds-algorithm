/**
 * 
 */
package com.learn.dsalgorithms.datastructure;

/**
 * @author Uthiraraj Saminathan
 *
 */
public class ArrayImplementation {

	static int count = 0;
	   static int capacity = 0; 
	   public ArrayImplementation(int capacity){
	      this.capacity = capacity;
	   }

	   public static void main(String[] args){

	   ArrayImplExample arrExamp = new ArrayImplExample(5);
	   
	   int[] arr = new int[capacity];
	   
	   //System.out.println("Array Length :"+arr.length);

	   arrExamp.addItem(arr,10);
	   arrExamp.addItem(arr,1);
	   arrExamp.addItem(arr,5);
	   arrExamp.addItem(arr,12);
	   arrExamp.addItem(arr,21);
	   arrExamp.printArr(arr);
	   
	   //System.out.println("Index Position of 10 :"+arrExamp.getItemIndex(arr,10));
	   //System.out.println("Index Position of 1 :"+arrExamp.getItemIndex(arr,1));
	   //System.out.println("Index Position of 0 :"+arrExamp.getItemIndex(arr,0));
	   
	   //arrExamp.printArr(arr);
	   //arrExamp.addItemAtIndex(arr,2,3);
	   //arrExamp.printArr(arr);
	   
	   //arrExamp.deleteItem(arr);
	   //arrExamp.printArr(arr);
	   
	   arrExamp.deleteItemByValue(arr,5);
	   arrExamp.printArr(arr);
	   
	 } 

	  /***
	  * Add given Item at the end of the Index.
	  ***/
	  public void addItem(int[] arr,int value){
	   
	   arr[count++] = value;
	   
	  }
	  
	  /***
	  * If given Item is found return that Item current position.
	  * If not found then return -1
	  ***/
	  public int getItemIndex(int[] arr, int value){
	  
	    for(int i=0; i<arr.length; i++){
	       if(arr[i] == value){
	         return i;
	       }
	     }
	    return -1;
	  }
	  
	  /***
	  * Add a given Item into specified index position
	  ***/
	  public void addItemAtIndex(int[] arr,int indexPosition,int value){
	  
	    //int valueIndex = getItemIndex(arr,value);
	    //System.out.println("ValueIndex value :"+valueIndex);
	    for(int i=arr.length-1; i>indexPosition; i--){
	        //System.out.println("Value of i:"+i);
	        arr[i] = arr[i-1];
	    }
	    arr[indexPosition] = value;
	  }
	  
	  /***
	  * Delete last item of the array.After deletion value will be
	  * updated to zero
	  ***/
	  public void deleteItem(int[] arr){
	    arr[count-1] = 0;
	  }
	  
	  public void deleteItemByValue(int[] arr,int value){
	    
	    int valueIndex = getItemIndex(arr,value);
	    for(int i=valueIndex; i<arr.length-1; i++){
	       arr[i] = arr[i+1];
	    }
	    arr[arr.length-1] = 0;
	  }

	  /***
	  * Print all the values in given Array.
	  ***/
	  public void printArr(int[] arr){
	    for(int i=0; i<arr.length; i++){
	     System.out.println(arr[i]);
	    }
	  }
	
}
