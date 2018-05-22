package ch14;

import java.util.HashSet;

/**
 * This class is to a weighted graph class, which is used for path finding
 * algorithm, Such as Dijkstra algorithm.
 * 
 * @author QH
 *
 */

public class WeightedGraph<E> {
	private double[][] WeightedEdges; // adjacency matrix for weighted edges
	private E[] labels; // vertex labels in an array

	/**
	 * Constructor
	 * 
	 * @param n
	 *            the number of vertices
	 */

	@SuppressWarnings("unchecked")
	public WeightedGraph(int n) {
		WeightedEdges = new double[n][n]; // adjacency matrix for weighted edges
		for (double[] row : WeightedEdges) { // all edges' weights are set to infinity
			for (int i = 0; i < row.length; i++) {
				row[i] = Double.POSITIVE_INFINITY;
			}
		}

		labels = (E[]) new Object[n];

	}

	/**
	 * Add a new edge
	 * 
	 * @param source
	 *            the source vertex
	 * @param target
	 *            the ending vertex
	 * @param distance
	 *            the weight of edge
	 */
	public void addEdge(int source, int target, double distance) {
		WeightedEdges[source][target] = distance;
	}

	// remove an edge
	public void removeEdge(int source, int target) {
		WeightedEdges[source][target] = Double.POSITIVE_INFINITY;
	}

	/**
	 * A method to judge whether there is a path between two vertices
	 * 
	 * @param source
	 *            the source vertex
	 * @param target
	 *            the ending vertex
	 * @return if there is a path (non infinity weight) between two vertices, return
	 *         true; else return false
	 */
	public boolean isEdge(int source, int target) {
		return WeightedEdges[source][target] != Double.POSITIVE_INFINITY && WeightedEdges[source][target] >= 0;
	}

	// return the label of a vertex
	public E getLabel(int vertex) {
		return labels[vertex];
	}

	// set the label of a vertex
	public void setLabel(int vertex, E label) {
		labels[vertex] = label;
	}

	/**
	 * Return the size of graph, the number of vertices
	 * 
	 * @return the size of graph, the number of vertices
	 * 
	 */
	public int size() {
		return WeightedEdges.length;
	}

	/**
	 * return an array list (integer) of vertices which is connected with parameter
	 * vertex through a path (non infinity)
	 * 
	 * @param vertex
	 *            the source vertex to be checked
	 * @return an array list (integer) of vertices which is connected with parameter
	 *         vertex
	 */
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

	/**
	 * Dijkstra algorithm which is based on Data Structure Using Java 4e
	 * 
	 * @param start
	 *            the starting vertex
	 * @param destination
	 *            the destination vertex
	 * @return the shortest distance between start and destination. if return the
	 *         local variable distances (double[]), it contains the shortest
	 *         distance from start to all other vertices
	 */

	public double DijkstraPathFinder(int start, int destination) {
		int n = size(); // find the number of vertices

		// initialize the distance array
		// set other vertices distance to infinity, and set distance of initial vertex
		// is 0
		double[] distances;
		distances = new double[n]; // initialize the distance array
		for (int i = 0; i < distances.length; i++) {
			distances[i] = Double.POSITIVE_INFINITY;
		}
		distances[start] = 0;

		// set initial vertex as current
		int current = start;

		// A set named allowedVertices, current one is not included
		HashSet<Integer> allowedVertices = new HashSet<>();

		for (int allowedSize = 1; allowedSize < n; allowedSize++) {

			// Step 3a.
			// find all neighboring vertices of current;
			int[] neighbors = neighbors(current);
			int vertexOfMin = neighbors[0];
			double[] distanceToCurrent = WeightedEdges[current];

			// for neighbor is not in allow List, find closet vertex
			for (int neighbor : neighbors) {
				if (!allowedVertices.contains(neighbor)
						&& distanceToCurrent[neighbor] < distanceToCurrent[vertexOfMin]) {
					vertexOfMin = neighbor;
				}
			}
			// Step 3b, add the vertex next to the set allowedVertices.
			allowedVertices.add(current);

			// Step 3c, revise the distance array so the new vertex (next) may appear on
			// permitted paths.
			for (int i = 0; i < n; i++) {

				if (!allowedVertices.contains(i) && distanceToCurrent[i] < Double.POSITIVE_INFINITY) {
					double newDistance = distances[current] + distanceToCurrent[i];
					if (distances[i] > newDistance) {
						distances[i] = newDistance;
					}
				}
			}
			current = vertexOfMin;
		}
		return distances[destination];
	}

	/**
	 * Dijkstra algorithm which is based on CS106 guidebook If this method return
	 * the local variable of distances, it contains distances from start to all
	 * vertices
	 * 
	 * @param start
	 *            starting vertex
	 * @param destination
	 *            destination vertex
	 * @return the shortest distance
	 */

	public double DijkstraPathFinder1(int start, int destination) {
		int n = size(); // find the number of vertices

		// initialize the distance array
		// set other vertices distance to infinity, and set distance of initial vertex
		// is 0
		double[] distances;
		distances = new double[n];
		for (int i = 0; i < distances.length; i++) {
			distances[i] = Double.POSITIVE_INFINITY;
		}
		distances[start] = 0;

		// set initial vertex as current
		int current = start;

		// A set named unvisited
		HashSet<Integer> unvisited = new HashSet<>();
		// add all other vertices into the set of unvisited
		for (int i = 0; i < n; i++) {
			if (i != start) {
				unvisited.add(i);
			}
		}

		// loop going to destination, once destination is visited, loop exits
		while (unvisited.contains(destination)) {
			// find all neighboring vertices of current;
			int[] neighbors = neighbors(current);

			// get distance to all neighboring vertices
			double[] distanceToAllNeighbors = WeightedEdges[current]; // get distance to all neighboring vertices

			// For the current vertex, computer the distance to all of its unvisited
			// neighbors.
			// If the computed distance to the unvisited neighbor is less than the current
			// distance stored in the unvisited neighbor, change it to the newly computed
			// distance.
			for (int neighbor : neighbors) {
				double computedDistance = distances[current] + distanceToAllNeighbors[neighbor];
				if (unvisited.contains(neighbor)) {
					if (distances[neighbor] > computedDistance) {
						distances[neighbor] = computedDistance;
					}
				}
			}

			// After test all unvisited neighbors of current vertex, remove current vertex
			// from unvisited set.
			unvisited.remove(current);

			// select the unvisited vertex whose distance is shortest as current
			if (unvisited.size() > 0) {
				int vertexOfMin = (int) unvisited.toArray()[0]; // pick one for unvisited as min
				for (int vertex : unvisited) {
					if (distances[vertex] < distances[vertexOfMin]) {
						vertexOfMin = vertex;
					}
				}
				current = vertexOfMin;
			}
		}
		return distances[destination];
	}
}
