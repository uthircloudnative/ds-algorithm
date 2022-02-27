package com.learn.dsalgorithms.graph;

import java.util.*;


/**
 * @author Uthiraraj Saminathan
 *
 */
public class BreadthFirstSearch {

	public static void main(String[] args){
		   
	     //Key is Node, List is its neighbours
	     Map<String,List<String>> graph = new HashMap<>();
	     
	     graph.put("a",Arrays.asList("b","c"));
	     graph.put("b",Arrays.asList("d"));
	     graph.put("c",Arrays.asList("e"));
	     graph.put("d",Arrays.asList("f"));
	     graph.put("e",null);
	     graph.put("f",null);
	     
	     String currentNode = "a";
	     
	     recursiveBFS(graph,currentNode);
	     iterativeBFS(graph,currentNode);
	     
	   }
	   
	   private static void iterativeBFS(Map<String,List<String>> graph, String currentNode){
	   
	     currentNode = "a";
	     
	     //Print the graph based on Breath First Search
	     
	     //We have to use Stack to go deep and find all the subsequent child node of given node.
	     //Stack will hold the neighbour nodes for given node.
	     
	     Stack<String> neighbours = new Stack<>();
	     neighbours.push(currentNode);
	     
	     String tempCurrentNode = null;
	     
	     while(!neighbours.empty()){
	     
	       tempCurrentNode = neighbours.pop();
	       System.out.println(tempCurrentNode); // a,c,e,b,d,f
	       
	       if(graph.get(tempCurrentNode) != null){
	          for(String neigbourNode:graph.get(tempCurrentNode)){
	             neighbours.push(neigbourNode);
	             //b,c
	             //b,e
	             //b
	             //d
	             //e
	          }
	       }
	     }
	   }
	   
	   private static void recursiveBFS(Map<String,List<String>> graph, String currentNode){
	   
	     //System.out.println(currentNode); //a,b,
	     if(graph.get(currentNode) != null){
	       for(String neighbour:graph.get(currentNode)){
	           System.out.println(neighbour); 
	           recursiveBFS(graph,neighbour);
	          
	       }
	     }
	   
	   }
}
