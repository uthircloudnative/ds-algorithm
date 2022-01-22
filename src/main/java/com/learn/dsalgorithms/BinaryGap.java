package com.learn.dsalgorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BinaryGap {
	
	public static void main(String[] args){
		  
	    int n = 32;
	    int total = 0;
	    int oneCount = 0;
	    int zeroCount = 0;
	    int currentVal = 0;
	    
	    Stack<Integer> numStack = new Stack<>();
	    Map<Integer,Integer> map = new HashMap<>();
	    
	    //1000100001
	    while(n>0){
	      currentVal = n%2;
	      numStack.push(currentVal);
	      n = n/2;
	      
	      if(currentVal == 1 && !map.containsKey(1)){
	         oneCount++;
	         map.put(1,oneCount);
	      }else if(currentVal == 0 && map.containsKey(1) && map.get(1) == 1){
	         zeroCount++;
	         map.put(0,zeroCount);
	      }else if(currentVal == 1 && map.containsKey(1) && map.get(1) == 1 && map.containsKey(0)){
	         if(map.get(0) > total)
	           total = map.get(0);
	         zeroCount = 0;
	         map.put(0,zeroCount);
	         //map.put(1,map.get(1)-1);
	      }
	    }
	    
	  
	  }

}
