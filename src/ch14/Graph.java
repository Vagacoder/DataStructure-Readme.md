package ch14;

import java.util.*;

public class Graph<E> implements Cloneable {

	private boolean[][] edges; // adjacency matrix for edges
	private E[] labels; // vertex labels in an array

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		edges = new boolean[n][n];
		labels = (E[]) new Object[n];
	}

	public void addEdge(int source, int target) {
		edges[source][target] = true;
	}

	public void removeEdge(int source, int target) {
		edges[source][target] = false;
	}

	public boolean isEdge(int source, int target) {
		return edges[source][target];
	}

	public E getLabel(int vertex) {
		return labels[vertex];
	}

	public void setLabel(int vertex, E label) {
		labels[vertex] = label;
	}

	public int size() {
		return edges.length;
	}

	public Graph<E> clone() throws CloneNotSupportedException {
		@SuppressWarnings("unchecked")
		Graph<E> result = (Graph<E>) super.clone();
		result.edges = edges.clone(); // Does this work?? its 2 dimensional array
		result.labels = labels.clone();
		return result;
	}

	public int[] neighbors(int vertex) {
		int count;
		int[] answer;

		count = 0;
		for (int i = 0; i < labels.length; i++) {
			if (edges[vertex][i])
				count++;
		}

		answer = new int[count];

		count = 0;
		for (int i = 0; i < labels.length; i++) {
			if (edges[vertex][i])
				answer[count++] = i;
		}
		return answer;
	}

	public int[] neighbors1(int vertex) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < edges[vertex].length; i++) {
			boolean isEdge = edges[vertex][i];
			if (isEdge) {
				result.add(i);
			}
		}

		int[] resultArray = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			resultArray[i] = result.get(i);
		}

		return resultArray;
	}

	public void removeVertex(int k) {
		if (k > labels.length) {
			throw new IllegalArgumentException("Out of range!");
		}
		@SuppressWarnings("unchecked")
		E[] newLabels = (E[]) new Object[k];
		System.arraycopy(labels, 0, newLabels, 0, k);
		labels = newLabels;

		boolean[][] newEdges = new boolean[k][k];
		for (int i = 0; i < edges.length; i++) {
			boolean[] newRow = new boolean[k];
			System.arraycopy(edges[i], 0, newRow, 0, k);
			newEdges[i] = newRow;
		}
		edges = newEdges;
	}

	public void addVertex(int k) {

	}

	public void interChange(int i, int j) {
		E temp = labels[i];
		labels[i] = labels[j];
		labels[j] = temp;

		boolean[] tempRow = edges[i];
		edges[i] = edges[j];
		edges[j] = tempRow;

		for (boolean[] row : edges) {
			boolean tempB = row[i];
			row[i] = row[j];
			row[j] = tempB;
		}

	}

	public static <E> int findMaxEdges(Graph<E> g) {
		int maxEdges = 0;
		int indexOfMaxEdges = 0;
		for (int i = 0; i < g.size(); i++) {
			int numberOfEdges = g.neighbors(i).length;
			if (numberOfEdges > maxEdges) {
				maxEdges = numberOfEdges;
				indexOfMaxEdges = i;
			}
		}

		return indexOfMaxEdges;
	}

	public static <E> void depthFirstPrint(Graph<E> g, int start) {
		boolean[] visited = new boolean[g.size()];
		depthFirstRecurse(g, start, visited);
	}

	public static <E> void depthFirstRecurse(Graph<E> g, int v, boolean[] visited) {
		int[] connections = g.neighbors(v);
		visited[v] = true;
		System.out.println(g.getLabel(v));

		for (int nextNeighbor : connections) {
			if (!visited[nextNeighbor])
				depthFirstRecurse(g, nextNeighbor, visited);
		}
	}

	public static <E> void breadthFirstPrint(Graph<E> g, int start) {
		Queue<Integer> visiting = new LinkedList<>();
		boolean[] visited = new boolean[g.size()];
		int current = start;
		visiting.add(start);
		while (!visiting.isEmpty()) {
			current = visiting.remove();
			visited[current] = true;
			System.out.println(g.getLabel(current));
			int[] neighbors = g.neighbors(current);
			for (int neighbor : neighbors) {
				if (!visited[neighbor]) {
					visiting.add(neighbor);
				}
			}
		}
	}
	
	public static <E> void depthFirstPrint1(Graph<E> g, int start) {
		Stack<Integer> visiting = new Stack<>();
		boolean[] visited = new boolean[g.size()];
		int current = start;
		visiting.push(start);
		while (!visiting.isEmpty()) {
			current = visiting.pop();
			if (visited[current]) {continue;}
			visited[current] = true;
			System.out.println(g.getLabel(current));
			int[] neighbors = g.neighbors(current);
			for (int i = neighbors.length-1; i >= 0; i--) {
				int neighbor = neighbors[i];
				if (!visited[neighbor]) {
					visiting.push(neighbor);
				}
			}
		}
	}
}
