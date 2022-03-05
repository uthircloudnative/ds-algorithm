package com.learn.dsalgorithms.graph;

import java.util.*;


/**
 * @author Uthiraraj Saminathan
 *
 */
public class DepthAndBreadthFirstSearch {

	public static void main(String[] args){
		   
	     //Key is Node, List is its neighbors
	     Map<String,List<String>> graph = new HashMap<>();
	     
	     graph.put("a",Arrays.asList("b","c"));
	     graph.put("b",Arrays.asList("d"));
	     graph.put("c",Arrays.asList("e"));
	     graph.put("d",Arrays.asList("f"));
	     graph.put("e",null);
	     graph.put("f",null);
	     
	     String currentNode = "a";
	     List<String> result = null;
	     
	     result = iterativeDFS_Stack(graph,currentNode);
	     System.out.println(result);
	     
	     result = iterativeDFS_LinkedList(graph,currentNode);
	     System.out.println(result);
	     
	     result = iterativeDFS_ArrayDequeue(graph,currentNode);
	     System.out.println(result);
	     
	     //recursiveDFS(graph,currentNode);
	     //iterativeDFS(graph,currentNode);
	     
	   }
	
	/**
	 * iterativeDFS_Stack is implementation of DFS using Stack DS.
	 * This implementation is having limitation as Stack is thread-safe because
	 * it implements Vector.
	 * 
	 * @param graph
	 * @param currentNode
	 */
	private static List<String> iterativeDFS_Stack(Map<String,List<String>> graph, String currentNode) {
		System.out.println("<---- iterativeDFS_Stack ---->");
		currentNode = "a";
	     
	     //Print the graph based on Breath First Search
	     
	     //We have to use Stack to go deep and find all the subsequent child node of given node.
	     //Stack will hold the neighbor nodes for given node.
	     
	     Stack<String> neighbours = new Stack<>();
	     List<String> result = new ArrayList<>();
	     neighbours.push(currentNode);
	     
	     String tempCurrentNode = null;
	     
	     while(!neighbours.empty()){
	     
	       tempCurrentNode = neighbours.pop();
	       //System.out.println(tempCurrentNode); // a,c,e,b,d,f
	       result.add(tempCurrentNode);
	       
	       if(graph.get(tempCurrentNode) != null){
	          for(String neigbourNode:graph.get(tempCurrentNode)){
	             neighbours.push(neigbourNode);
//	             //b,c
//	             //b,e
//	             //b
//	             //d
//	             //e
	          }
	       }
	     }
	     return result;
	}
	
	/***
	 * iterativeDFS_LinkedList is implementation of DFS using LinkedList DS.
	 * As we need to get/remove last item in the list we are using LinkedList as its optimal for this operation.
	 * 
	 * If given input don't have any null values we can use ArrayDequeue which is more optimal solution
	 * to implement Stack DS.
	 * 
	 * @param graph
	 * @param currentNode
	 */
	private static List<String> iterativeDFS_LinkedList(Map<String,List<String>> graph, String currentNode){
	   
		System.out.println("<---- iterativeDFS_LinkedList ---->");
	     currentNode = "a";
	     
	     LinkedList<String> neighbours = new LinkedList<>();
	     List<String> result = new ArrayList<>();
	     
	     neighbours.push(currentNode);
	     while(neighbours.size() > 0) {
	    	 currentNode = neighbours.pop();
	    	 //System.out.println(currentNode);
	    	 result.add(currentNode);
	    	 
	    	 if(graph.get(currentNode) != null 
	    			 && graph.get(currentNode).size() > 0) {
	    		 for(String neighborNode :graph.get(currentNode)) {
	    			 neighbours.push(neighborNode);
	    		 }
	    	 }
	    	
	     }
	     return result;
	   }
	
	   /**
	    * iterativeDFS_ArrayDequeue is DFS implementation using ArrayDequeue Stack implementation.
	    * 
	    * 
	    * @param graph
	    * @param currentNode
	    */
	   private static List<String> iterativeDFS_ArrayDequeue(Map<String,List<String>> graph, String currentNode) {
		   
		   ArrayDeque<String> stack = new ArrayDeque<>();
		   List<String> result = new ArrayList<>();
		   
		   stack.push(currentNode);
		   while(stack.size() > 0) {
			   currentNode = stack.pop();
			   //System.out.println(currentNode);
			   result.add(currentNode);
			   if(graph.containsKey(currentNode) 
					   && null != graph.get(currentNode)) {
				   for(String neighborNode : graph.get(currentNode)) {
					   stack.push(neighborNode);
				   }
			   }
		   }
		   return result;
	   }
	   
	   /**
	    * recursiveDFS is DFS implementation using recursive functions.
	    * 
	    * @param graph
	    * @param currentNode
	    */
	   private static void recursiveDFS(Map<String,List<String>> graph, String currentNode){
	   
	     System.out.println(currentNode); //a,b,
	     if(graph.get(currentNode) != null){
	       for(String neighbour:graph.get(currentNode)){
	           //System.out.println(neighbour); 
	           recursiveDFS(graph,neighbour);
	          
	       }
	     }
	   }
}
