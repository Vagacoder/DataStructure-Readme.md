package ch14;

public class GraphTester {

	public static void main(String[] args) {
		Graph<Double> g1 = new Graph<>(4);
		g1.setLabel(0, 10.0);
		g1.setLabel(1, 11.0);
		g1.setLabel(2, 12.0);
		g1.setLabel(3, 13.0);
		g1.addEdge(0, 1);
		g1.addEdge(0, 2);

		int[] neighbor = g1.neighbors(0);
		for (int vertex : neighbor) {
			System.out.println(vertex);
		}

		int[] neighbor1 = g1.neighbors1(0);
		for (int vertex : neighbor1) {
			System.out.println(vertex);
		}
	}

}
