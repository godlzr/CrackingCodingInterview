package com.DataStructures.TreeGraph;

import com.DataStructures.TreeGraph.*;
import com.DataStructures.StacksQueues.Queue;
public class GraphHelper {

	boolean [] visited;
	/*****************DFS****************************************/
	/*****************Adjacency Matrix**************************/

	public void DFSTraverse(GraphAdjacencyMatrix g) {
		visited = new boolean[g.vertexCount];
		for(int i = 0; i < g.vertexCount; i++)
			visited[i] = false;
		for(int i = 0; i < g.vertexCount; i++) {
			if(!visited[i])
				DepthFirstSearch(g, i);
		}
	}
	private void DepthFirstSearch(GraphAdjacencyMatrix g, int n) {
		visited[n] = true;
		System.out.print(n);
		for(int j = 0; j < g.vertexCount; j++) {
			if(g.adjcentMatrix[n][j] == true && !visited[j])
				DepthFirstSearch(g, j);
		}
	}
	/*****************Adjacency List**************************/
	public void DFSTraverse(DirectedGraphAdjacencyList g) {
		visited = new boolean[g.vertex];
		for(int i = 0; i < g.vertex; i++)
			visited[i] = false;
		for(int i = 0; i < g.vertex; i++) {
			if(!visited[i])
				DepthFirstSearch(g, i);
		}
	}
	
	private void DepthFirstSearch(DirectedGraphAdjacencyList g, int n) {
		visited[n] = true;
		System.out.print(n);
		for(int i = 0; i < g.adjacencyList[n].size(); i++) {
			int j = g.adjacencyList[n].get(i);
			if(!visited[j]) {
				DepthFirstSearch(g, j);
			}
		}
	}
	/*****************DFS****************************************/
	
	/*****************BFS****************************************/
	/*****************Adjacency Matrix**************************/
	public void BFSTravser(GraphAdjacencyMatrix g){
		Queue queue = new Queue();
		visited = new boolean[g.vertexCount];
		for(int i = 0; i < g.vertexCount; i++) {
			visited[i] = false;
		}
		for(int i = 0; i < g.vertexCount; i++) {
			if(!visited[i]) {
				visited[i] = true;
				System.out.print(i);
				queue.enqueue(i);
				while(!queue.isEmpty()) {
					int m = (Integer)queue.dequeue().data;
					for(int j = 0; j < g.vertexCount; j++) {
						if(g.adjcentMatrix[m][j] && !visited[j]) {
							visited[j] = true;
							System.out.print(j);
							queue.enqueue(j);
						}
					}
				}
			}
		}
	}
	
	/*****************Adjacency List**************************/
	public void BFSTravser(DirectedGraphAdjacencyList g) {
		Queue queue = new Queue();
		visited = new boolean[g.vertex];
		for(int i = 0; i < g.vertex; i++) {
			visited[i] = false;
		}
		for(int i = 0; i < g.vertex; i++) {
			if(!visited[i]) {
				visited[i] = true;
				System.out.print(i);
				queue.enqueue(i);
				while(!queue.isEmpty()) {
					int m = (Integer)queue.dequeue().data;
					for(int j = 0; j < g.adjacencyList[m].size(); j++) {
						int k =g.adjacencyList[m].get(j);
						if(!visited[k]) {
							visited[k] = true;
							System.out.print(k);
							queue.enqueue(k);
						}
					}
				}
			}
		}
	}
	/*****************BFS****************************************/
	public boolean isConnected(DirectedGraphAdjacencyList g, int a, int b) {
		Queue queue = new Queue();
		visited = new boolean[g.vertex];
		for(int i = 0; i < g.vertex; i++) {
			visited[i] = false;
		}
		if(!visited[a]) {
			visited[a] = true;
			queue.enqueue(a);
			while(!queue.isEmpty()) {
				int m = (Integer)queue.dequeue().data;
				for(int j = 0; j < g.adjacencyList[m].size(); j++) {
					int k =g.adjacencyList[m].get(j);
					if(!visited[k]) {
						visited[k] = true;
						queue.enqueue(k);
					}
				}
			}
		}
		return visited[b];
	}
}
