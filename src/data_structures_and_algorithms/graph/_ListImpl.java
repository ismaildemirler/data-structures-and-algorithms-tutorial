package data_structures_and_algorithms.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
	
	/*
	 * Iterative
	 */
	public void dfs(int node) {
		boolean[] visited = new boolean[v];
		
		Stack<Integer> stack = new Stack<>();
		stack.push(node);
		
		while (!stack.isEmpty()) {
			int u = stack.pop();

			if (!visited[u]) {
				visited[u] = true;
				System.out.print(u + " ");
				
				for (int v : adj[u]) {
					if (!visited[v]) {
						stack.push(v);
					}
				}
			}
		}
	}
	
	/*
	 * Recursive
	 */
	public void dfs() {
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				dfs(i, visited);
			}
		}
	}

	private void dfs(int i, boolean[] visited) {
		visited[i] = true;
		System.out.print(i + " ");
		for (int w : adj[i]) {
			if (!visited[w]) {
				dfs(w, visited);
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
