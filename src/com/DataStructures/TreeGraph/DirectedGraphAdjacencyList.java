package com.DataStructures.TreeGraph;
import java.util.Iterator;
import java.util.LinkedList;
public class DirectedGraphAdjacencyList {
	int vertex;
	LinkedList<Integer>[] adjacencyList; 
	
	public DirectedGraphAdjacencyList(int vertex) {
		this.vertex = vertex;
		adjacencyList = (LinkedList<Integer>[])new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) 
			adjacencyList[i] = new LinkedList<Integer>();
	}
	
	public void addEdge(int i, int j) {
		adjacencyList[i].add(j);
	}
	
	public void removeEdge(int i, int j) {
		Iterator<Integer> it = adjacencyList[i].iterator();
		while(it.hasNext()) {
			if(it.next() == j) {
				it.remove();
				return;
			}
		}
	}
	
	public boolean isEdge(int i, int j) {
		return adjacencyList[i].contains(j);
	}
	
}
