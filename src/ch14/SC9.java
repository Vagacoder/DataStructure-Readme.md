package ch14;

public class SC9 {

	public static void main(String[] args) {
		Graph<String> g1 = new Graph<>(9);
		g1.setLabel(0, "Darwin");
		g1.setLabel(1, "BlackStump");
		g1.setLabel(2, "Perth");
		g1.setLabel(3, "Adelaide");
		g1.setLabel(4, "Canberra");
		g1.setLabel(5, "Brisbane");
		g1.setLabel(6, "Sydney");
		g1.setLabel(7, "Melbourne");
		g1.setLabel(8, "Hobart");
		g1.addEdge(2, 1);
		g1.addEdge(1, 0);
		g1.addEdge(0, 4);
		g1.addEdge(4, 3);
		g1.addEdge(3, 2);
		g1.addEdge(4, 5);
		g1.addEdge(5, 6);
		g1.addEdge(4, 6);
		g1.addEdge(6, 4);
		g1.addEdge(6, 7);
		g1.addEdge(7, 4);
		g1.addEdge(3, 7);
		g1.addEdge(7, 8);
		g1.addEdge(8, 7);

//		int[] neighbor4 = g1.neighbors(6);
//		for (int vertex : neighbor4) {
//			System.out.println(g1.getLabel(vertex));
//		}

		//System.out.println();
		//Graph.breadthFirstPrint(g1, 6);
		System.out.println();
		Graph.depthFirstPrint(g1, 6);
		System.out.println();
		Graph.depthFirstPrint1(g1, 6);
	}

}
