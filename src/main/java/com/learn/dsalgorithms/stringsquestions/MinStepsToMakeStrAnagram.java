package com.learn.dsalgorithms.stringsquestions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Uthiraraj Saminathan
 *
 */
public class MinStepsToMakeStrAnagram {
	
	public static void main(String[] args) {
		printStepCount("cotxazilut","nahrrmcchxwrieqqdwdpneitkxgnt");
		
		//{a=1, c=1, t=2, u=1, x=1, i=1, z=1, l=1, o=1}
		//{a=1, c=2, d=2, e=2, g=1, h=2, i=2, k=1, m=1, n=3, p=1, q=2, r=3, t=2, w=2, x=2}
		//{ d=2, e=2, g=1, h=2,  k=1, m=1, n=3, p=1, q=2, r=3,  w=2, }
		//1+1+1+1+1+1+1
	}

	private static void printStepCount(String s,String t) {
		
		 char[] sArr = s.toCharArray();
	        
	        Map<Character, Integer> sMap = new HashMap<>();
	        for(char sch:sArr){
	            if(sMap.containsKey(sch)){
	                sMap.put(sch,sMap.get(sch)+1);
	            }else{
	                int count = 1;
	                sMap.put(sch,count);
	            }
	        }
	        
	        
	        char[] tArr = t.toCharArray();
	        
	        Map<Character, Integer> tMap = new HashMap<>();
	        for(char tch:tArr){
	            if(tMap.containsKey(tch)){
	                tMap.put(tch,tMap.get(tch)+1);
	            }else{
	                int count = 1;
	                tMap.put(tch,count);
	            }
	        }
	        
	        int count = 0;
	        for(Map.Entry<Character, Integer> entry:sMap.entrySet()){
	            if(!tMap.containsKey(entry.getKey())){
	               count = count + entry.getValue();
	            }else if(tMap.get(entry.getKey()) != entry.getValue()){
	                count = count + Math.abs(tMap.get(entry.getKey())-entry.getValue());
	            }
	        }
	        
	        for(Map.Entry<Character, Integer> tentry:tMap.entrySet()){
	            if(!sMap.containsKey(tentry.getKey())){
	               count = count + tentry.getValue();
	            }
//	            else if(sMap.get(tentry.getKey()) != tentry.getValue()){
//	                count = count + Math.abs(sMap.get(tentry.getKey())-tentry.getValue());
//	            }
	        }
	        
	        System.out.println(count);
	        //return count;
	}
}
