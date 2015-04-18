package com.DataStructures.TreeGraph;

public class GraphAdjacencyMatrix {
	boolean adjcentMatrix[][];
	int vertexCount;
	
	public GraphAdjacencyMatrix(int vertexCount) {
		this.vertexCount = vertexCount;
		adjcentMatrix = new boolean[vertexCount][vertexCount];
	}
	
	public void addEdge(int i, int j) {
		if(i >= 0 && j >= 0 && i < vertexCount && j < vertexCount) {
			adjcentMatrix[i][j] = true;
			adjcentMatrix[j][i] = true;
		}
	}
	
	public void removeEdge(int i, int j) {
		if(i >= 0 && j >= 0 && i < vertexCount && j < vertexCount) {
			adjcentMatrix[i][j] = false;
			adjcentMatrix[j][i] = false;
		}
	}
	
	public boolean isEdeg(int i, int j) {
		if(i >= 0 && j >= 0 && i < vertexCount && j < vertexCount) {
			return adjcentMatrix[i][j];
		} else
			return false;
	}
	
}
