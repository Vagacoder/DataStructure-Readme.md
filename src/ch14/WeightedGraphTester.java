package ch14;

public class WeightedGraphTester {

	public static void main(String[] args) {
		WeightedGraph<String> g1 = new WeightedGraph<>(6);
		g1.setLabel(0, "v0");
		g1.setLabel(1, "v1");
		g1.setLabel(2, "v2");
		g1.setLabel(3, "v3");
		g1.setLabel(4, "v4");
		g1.setLabel(5, "v5");
		g1.addEdge(0, 1, 2.0);
		g1.addEdge(0, 5, 9.0);
		g1.addEdge(1, 2, 8.0);
		g1.addEdge(1, 3, 15.0);
		g1.addEdge(1, 5, 6.0);
		g1.addEdge(2, 3, 1.0);
		g1.addEdge(5, 4, 3.0);
		g1.addEdge(4, 3, 3.0);
		g1.addEdge(4, 2, 7.0);
		
	}

}
