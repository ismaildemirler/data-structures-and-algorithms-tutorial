package data_structures_and_algorithms.graph;

public class _MatrixImpl {

	private int v; // Number of vertices in Graph
	private int e; // Number of edges in Graph
	private int[][] adjMatrix;
	
	public _MatrixImpl(int nodes) {
		this.v = nodes;
		this.e = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v) {
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1;
		e++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(v + " vertices, " + e + " edges " + "\n");
		for (int i = 0; i < v; i++) {
			sb.append(i + ": ");
			for (int w : adjMatrix[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
