package com.learn.dsalgorithms.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 
 * BreathFirstSearchImpl is implementation of BFS using Queue DS.
 * It can be implemented using only using iterative approach.
 * 
 * @author Uthiraraj Saminathan
 *
 */
public class BreathFirstSearchImpl {

	public static void main(String[] args) {
		
		//Key is Node, List is its neighbors
	     Map<String,List<String>> graph = new HashMap<>();
	     
	     graph.put("a",Arrays.asList("b","c"));
	     graph.put("b",Arrays.asList("d"));
	     graph.put("c",Arrays.asList("e"));
	     graph.put("d",Arrays.asList("f"));
	     graph.put("e",null);
	     graph.put("f",null);
	     
	     String currentNode = "a";
	     
	     //a,b,c,d,e,f
	     List<String> result = iterativeBFS_LinkedListQ(graph,currentNode);
	     
	     System.out.println(result);
	     
	}
	
	/**
	 * iterativeBFS_LinkedListQ is implementation of BFS using Q.
	 * Here we are using LinkedList Queue implementation as BFS
	 * require FIFO structure to get the graph navigation result.
	 * 
	 * @param graph
	 * @param currentNode
	 * @return
	 */
	private static List<String> iterativeBFS_LinkedListQ(Map<String,List<String>> graph, String currentNode){
		
		Queue<String> queue = new LinkedList<>();
		List<String> result = new ArrayList<>();
		
		queue.add(currentNode);
		
		while(queue.size() > 0) {
			currentNode = queue.poll();
			result.add(currentNode);
			
			if(graph.containsKey(currentNode) 
					&& null != graph.get(currentNode)) {
				for(String neighborNode:graph.get(currentNode)) {
					queue.add(neighborNode);
				}
			}
		}
		return result;
	}

}
