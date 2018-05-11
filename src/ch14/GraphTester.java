package ch14;

public class GraphTester {

	public static void main(String[] args) {
		Graph<Double> g1 = new Graph<>(6);
		g1.setLabel(0, 10.0);
		g1.setLabel(1, 11.0);
		g1.setLabel(2, 12.0);
		g1.setLabel(3, 13.0);
		g1.setLabel(4, 14.0);
		g1.setLabel(5, 15.0);
		g1.addEdge(0, 1);
		g1.addEdge(0, 2);
		g1.addEdge(2, 3);
		g1.addEdge(3, 5);
		g1.addEdge(2, 1);

		int[] neighbor = g1.neighbors(0);
		for (int vertex : neighbor) {
			System.out.println(vertex);
		}

		int[] neighbor1 = g1.neighbors1(0);
		for (int vertex : neighbor1) {
			System.out.println(vertex);
		}

		 Graph.depthFirstPrint(g1, 0);
		//Graph.breadthFirstPrint(g1, 0);
	}

}
