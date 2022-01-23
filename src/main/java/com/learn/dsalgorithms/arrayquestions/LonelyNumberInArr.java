/**
 * 
 */
package com.learn.dsalgorithms.arrayquestions;

import java.util.*;
//import java.util.;

/**
 * @author Uthiraraj Saminathan
 *
 */
public class LonelyNumberInArr {

	public static void main(String[] args) {
		//nums = new int[] {10,6,5,8};
		findLonely(new int[] {1,2});
		
	}
	
	
	public static List<Integer> findLonely(int[] nums) {
		 
       List<Integer> val = new ArrayList<Integer>();
       if(nums.length ==1){
           val.add(nums[0]);
           
          return val;
           //System.out.println(val);
       }else{
           
           Arrays.sort(nums);
           
           int i=0;
           int l=-1;
           int r=1;
           
           while(i<nums.length){
               
               if(i==0){
            	   if(nums[r] - nums[i] > 1)
                   val.add(nums[i]);
            	   
               }else if(i== nums.length-1){
            	   if(nums[i]-nums[l] > 1)
                   val.add(nums[i]);
            	   
               }else{
                   if(nums[i]-nums[l] >1 && nums[r] - nums[i] > 1){
                       val.add(nums[i]);
                   }
               }
               i++;
               l++;
               r++;
               
           }
           return val;
       }
   }
	
}
