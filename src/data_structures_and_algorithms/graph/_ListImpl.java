package data_structures_and_algorithms.graph;

import java.util.LinkedList;
import java.util.Queue;

public class _ListImpl {
	
	private LinkedList<Integer>[] adj;
	private int v; // number of vertices
	private int e; // number of edges
	
	public _ListImpl(int nodes) {
		this.v = nodes;
		this.e = 0;
		this.adj = new LinkedList[nodes];
		
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		e++;
	}
	
	public void bfs(int node) {
		boolean[] visited = new boolean[v];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[node] = true;
		queue.offer(node);
		
		while (!queue.isEmpty()) {
			int u = queue.poll();
			System.out.print(u + " ");
			
			for (int v : adj[u]) {
				if (!visited[v]) {
					visited[v] = true;
					queue.offer(v);
				}
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(v + " vertices, " + e + " edges " + "\n");
		for (int i = 0; i < v; i++) {
			sb.append(i + ": ");
			for (int w : adj[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
