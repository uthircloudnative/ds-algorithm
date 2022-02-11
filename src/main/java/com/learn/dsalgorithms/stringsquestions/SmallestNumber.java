package com.learn.dsalgorithms.stringsquestions;

import java.util.Arrays;

public class SmallestNumber{

     public static void main(String[] args){
    	 
    	 long num = 310;
    	 
    	 String value = Long.toString(num);
    	 
    	 char[] numArr = null;
    	 String finalNum = null;
    	 long result = 0;
    	 StringBuilder nbrBuilder = new StringBuilder();
    	 StringBuilder zeroBuilder = new StringBuilder();
    	 
    	 if(num >= 0) {
    		 numArr = value.toCharArray();
    		 
    		 Arrays.sort(numArr);
    		 int i = 0;
    		 while(i < numArr.length) {
    			 
    			 if(numArr[i] == '0') {
    				 zeroBuilder.append(0);
    			 }else {
    				 nbrBuilder.append(numArr[i]);
    			 }
    			 i++;
    		 }
    		 
    		 if(zeroBuilder.length()>0) {
    			 zeroBuilder.toString();
    			 nbrBuilder.insert(1, zeroBuilder.toString());
    			 finalNum = nbrBuilder.toString();
    		 }else {
    			 finalNum = nbrBuilder.toString();
    		 }
    		 
    	 }else {
    		 numArr = value.substring(1).toCharArray();
    		 
    		 Arrays.sort(numArr);
    		 int i = numArr.length-1;
    		 while(i >=0) {
    			 nbrBuilder.append(numArr[i]);
    			 i--;
    		 }
    		 finalNum = "-"+nbrBuilder.toString();
    		 
    	 }
    	 
    	 result = Long.valueOf(finalNum);
    	 System.out.println(result);
    	 
     }
     
     

}