package ch14;

import java.util.HashSet;

public class WeightedGraph<E> {
	private double[][] WeightedEdges; // adjacency matrix for edges
	private E[] labels; // vertex labels in an array
	

	@SuppressWarnings("unchecked")
	public WeightedGraph(int n) {
		WeightedEdges = new double[n][n];
		for (double[] row : WeightedEdges) {
			for (double number : row) {
				number = Double.POSITIVE_INFINITY;
			}
		}

		labels = (E[]) new Object[n];
		
	}

	public void addEdge(int source, int target, double distance) {
		WeightedEdges[source][target] = distance;
	}

	public void removeEdge(int source, int target) {
		WeightedEdges[source][target] = Double.POSITIVE_INFINITY;
	}

	public boolean isEdge(int source, int target) {
		return WeightedEdges[source][target] != Double.POSITIVE_INFINITY && WeightedEdges[source][target] >= 0;
	}

	public E getLabel(int vertex) {
		return labels[vertex];
	}

	public void setLabel(int vertex, E label) {
		labels[vertex] = label;
	}

	public int size() {
		return WeightedEdges.length;
	}
	
	public int[] neighbors(int vertex) {
		int count = 0;
		for (int i = 0; i < labels.length; i++) {
			if (WeightedEdges[vertex][i] < Double.POSITIVE_INFINITY)
				count++;
		}

		int[] answer = new int[count];
		count = 0;
		
		for (int i = 0; i < labels.length; i++) {
			if (WeightedEdges[vertex][i] < Double.POSITIVE_INFINITY)
				answer[count++] = i;
		}
		return answer;
	}
	
	public void DijstraPathFinder(int start) {
		int n = size();
		
		double[] distances;
		distances = new double[n];
		for (double distance : distances) {
			distance = Double.POSITIVE_INFINITY;
		}
		distances[start] = 0;
		
		HashSet<Integer> allowedVertices = new HashSet<>();
	}

}
