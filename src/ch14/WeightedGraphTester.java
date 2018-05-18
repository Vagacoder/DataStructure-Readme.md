package ch14;

public class WeightedGraphTester {

	public static void main(String[] args) {

		// a complicated weighted graph,

		WeightedGraph<String> g1 = new WeightedGraph<>(14);
		g1.addEdge(0, 1, 1.0);
		g1.addEdge(0, 3, 13.0);
		g1.addEdge(1, 6, 9.0);
		g1.addEdge(2, 1, 6.0);
		g1.addEdge(3, 4, 4.0);
		g1.addEdge(4, 8, 7.0);
		g1.addEdge(5, 2, 2.0);
		g1.addEdge(5, 11, 7.0);
		g1.addEdge(6, 5, 7.0);
		g1.addEdge(6, 7, 8.0);
		g1.addEdge(6, 9, 3.0);
		g1.addEdge(7, 4, 3.0);
		g1.addEdge(7, 8, 2.0);
		g1.addEdge(8, 12, 3.0);
		g1.addEdge(9, 11, 5.0);
		g1.addEdge(9, 13, 11.0);
		g1.addEdge(10, 6, 10.0);
		g1.addEdge(10, 7, 1.0);
		g1.addEdge(10, 12, 5.0);
		g1.addEdge(11, 13, 4.0);
		g1.addEdge(12, 13, 6.0);
		g1.addEdge(13, 10, 8.0);

		// ================================================

		// a simple weighted graph, 6 vertices=============
		// WeightedGraph<String> g1 = new WeightedGraph<>(6);
		// g1.setLabel(0, "v0");
		// g1.setLabel(1, "v1");
		// g1.setLabel(2, "v2");
		// g1.setLabel(3, "v3");
		// g1.setLabel(4, "v4");
		// g1.setLabel(5, "v5");
		// g1.addEdge(0, 1, 2.0);
		// g1.addEdge(0, 5, 9.0);
		// g1.addEdge(1, 2, 8.0);
		// g1.addEdge(1, 3, 15.0);
		// g1.addEdge(1, 5, 6.0);
		// g1.addEdge(2, 3, 1.0);
		// g1.addEdge(5, 4, 3.0);
		// g1.addEdge(4, 3, 3.0);
		// g1.addEdge(4, 2, 7.0);
		// ===============================================

		// test the neighors() ===========================

		// int[] neighborOf1 = g1.neighbors(1);
		//
		// for (int i : neighborOf1) {
		// System.out.println(i + ", ");
		// }

		// ===============================================

		// System.out.print("From 0 to 13, expected: 22\nActual: ");
		// System.out.println(g1.DijkstraPathFinder1(0, 13));
		// System.out.println();
		//
		// System.out.print("From 0 to 10, expected: 30\nActual: ");
		// System.out.println(g1.DijkstraPathFinder1(0, 10));
		// System.out.println();

		System.out.print("From 0 to 13, expected: 22\nActual: ");
		System.out.println(g1.DijkstraPathFinder(0, 13));
		System.out.println();

		System.out.print("From 0 to 10, expected: 30\nActual: ");
		System.out.println(g1.DijkstraPathFinder(0, 10));
		System.out.println();
	}

}
