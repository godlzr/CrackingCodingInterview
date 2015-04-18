package com.DataStructures.TreeGraphTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.DataStructures.TreeGraph.*;
public class GraphHelperTest {

	@Test
	public void test() {
		GraphAdjacencyMatrix adjMatrixGraph = new GraphAdjacencyMatrix(7);
		
		adjMatrixGraph.addEdge(0, 1);
		adjMatrixGraph.addEdge(0, 2);
		adjMatrixGraph.addEdge(0, 3);
		adjMatrixGraph.addEdge(1, 4);
		adjMatrixGraph.addEdge(4, 6);
		adjMatrixGraph.addEdge(3, 5);
		adjMatrixGraph.addEdge(2, 5);
		adjMatrixGraph.addEdge(3, 6);
		
		DirectedGraphAdjacencyList adjListGraph = new DirectedGraphAdjacencyList(7);
		adjListGraph.addEdge(0, 1);
		adjListGraph.addEdge(0, 2);
		adjListGraph.addEdge(2, 5);
		adjListGraph.addEdge(3, 0);
		adjListGraph.addEdge(5, 3);
		adjListGraph.addEdge(6, 3);
		adjListGraph.addEdge(4, 1);
		adjListGraph.addEdge(4, 6);
		
		GraphHelper gh = new GraphHelper();
		//gh.DFSTraverse(adjMatrixGraph);
		//gh.DFSTraverse(adjListGraph);
		//gh.BFSTravser(adjMatrixGraph);
		//gh.BFSTravser(adjListGraph);
		System.out.print(gh.isConnected(adjListGraph, 0, 6));
	}

}
