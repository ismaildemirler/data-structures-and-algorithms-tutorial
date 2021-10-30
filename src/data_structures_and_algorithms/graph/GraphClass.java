package data_structures_and_algorithms.graph;

public class GraphClass {

	/*
	 * Graph Data Structures in Java
	 */
	
	/*
	 * What is a Graph?

	   - It is a non-linear data structure used for storing data.
	   - It is a set of vertices and a collection of edges that connects a pair 
	     of vertices
	 
	 * In below example 1, 2, 3, 4, 5 are the Vertex of Graph and each line 
	 * connecting them is called as Edge

                  vertex --> [[1]]------[[2]]
                               |\         \  
                               | \         \ -----> edge
                               |  \       [[5]]
                               |   \     /
                  vertex --> [[3]]--[[4]]              
                       
	 */
	
	/*
	 * Applications - Socail Network
					
				  People ----> [[Mustafa]]----[[Ayşe]]
				       \          /   \             \
				        \        /     \             \
				         \      /       \             \
				         _\/   /         \             \ 
				        [[Ahmet]]-----[[Hatice]]-----[[Mehmet]]
				        
     * Graphs help us to implement Socail Networking sites such as, Facebook,
     * Twitter etc. It can be called as Social Networking graph.
     * Names of people represent vertices of Graph.
     * Friendship between two people can be represented as an Edge of Graph.
	 */
	
	/*
	 * Applications - Web Content Over The Internet

                 Webpage ----> [[google.com]]----[[udemy.com]]
                        \          /        \                 \
                        _\/       /          \                 \
                         [[youtube.com]]----[[twitter.com]]----[[facebook.com]]

	 * Graph helps us to organize web content over the internet.
	 * Webpages such as google.com, udemy.com etc represent vertices of Graph.
	 * A Link between two webgapes can be represented as an Edge of Graph.
	 */
	
	/*
	 * Adjacency Matrix Representation (Undirected Graph)

                   vertex --> [[1]]------[[2]]
                               |\         \  
                               | \         \ -----> undirected edge
                               |  \       [[5]]
                               |   \     /
                  vertex -->[[3]]---[[4]]    
                                  |
                                  |
                                 \_/
                            undirected edge (it has no direction)
                            
	 * Example - Social Networking Graph is an undirected graph
	 * If Ali (vertex) is friend (edge) to Yusuf (vertex), than Yusuf (vertex) is
	 * also friend (edge) to Ali

                       [[Ali]]---------------[[Yusuf]]
                                Friendship

     * So this socail networking graph can be seen as an undirected graph where
     * edges are undirected. The don't have any direction moving ahead. So, graph
     * can be represented by a two dimensional array, which is nothing but matrix.

                                           ___________________
                                           ||               ||
           [[0]]----------[[1]]            || 0 | 1 | 0 | 1 ||    
             |              |              ||---------------||
             |              |              || 1 | 0 | 1 | 0 ||
             |              |              ||---------------||
             |              |              || 0 | 1 | 0 | 1 ||
           [[3]]----------[[2]]            ||---------------||
                                           || 1 | 0 | 1 | 0 ||
            undirected graph               ||_______________||
                                           
          [[row]]-------[[col]]            adjacency matrix[][]
                    1
                             
	 */     
	
	/*
	 * Adjacency List Representation (Undirected Graph)
	 * 
	 * It is another way to represent a undirected graph that is through adjacency list.
	 * So this adjacency list nothing but an array of linked list.

	                                           ___      |------------------------------|
	      [[0]]----------[[1]]               0 | | ---> | [[1]][-]--> [[3]][-]--> null |
	        |              |                   | |      |------------------------------|  
	        |              |                   |-|      |------------------------------|
	        |              |                 1 | | ---> | [[0]][-]--> [[2]][-]--> null |
	        |              |                   |-|      |------------------------------|
	      [[3]]----------[[2]]                 | |      |------------------------------|
	                                         2 | |--->  | [[3]][-]--> [[1]][-]--> null |
	       undirected graph                    |-|      |------------------------------|
	                                           | |      |------------------------------|
	                                         3 |_|--->  | [[2]][-]--> [[0]][-]--> null |
	                                                    |------------------------------|
	                                      array of linked lists
	 
	 * So here, you can see there are four nodes. So we can create an array of linked list
	 * having the size four. So you can see each and every index hold the linked list. And
	 * what is linked list contents. 
	 * Vertex 0 can be represented as in the array index 0. The linked list which it holds,
	 * has node 1 and node 3. So this structure tells us that from node 0, there is an edge
	 * to 1 and there is an edge to node 3. These structure is also similar for other vertexes.
	 */
	
	public void undirectedGraphImpl() {
		
		/*
		 * Adjacency Matrix Representation
		 */
		
		_MatrixImpl matrixImpl = new _MatrixImpl(4);
		matrixImpl.addEdge(0, 1);
		matrixImpl.addEdge(1, 2);
		matrixImpl.addEdge(2, 3);
		matrixImpl.addEdge(3, 0);

		System.out.println("Representing graph by using matrix : ");
		System.out.println(matrixImpl);
		System.out.println("***************************************");
		
		/*
		 * Adjacency List Representation
		 */
		_ListImpl listImpl = new _ListImpl(4);
		listImpl.addEdge(0, 1);
		listImpl.addEdge(1, 2);
		listImpl.addEdge(2, 3);
		listImpl.addEdge(3, 0);

		System.out.println("Representing graph by using array of linked list : ");
		System.out.println(listImpl);		
		System.out.println("***************************************");
		
		/*
		 * Bread First Search
		 * (Undirected Graph)
		 */
		breadthFirstSeacrh();
		
		/*
		 * Depth First Search
		 * (Undirected Graph)
		 */
		depthFirstSearch();
	}
	
	private void breadthFirstSeacrh() {
		
		/*
		 * Breadth First Search (BFS)

                   [[0]]----------[[1]]
                     |              |
                     |              |
                     |              |   [[4]]
                     |              |   /
                     |              |  /
                   [[3]]----------[[2]]
                   
		 * What do we mean by level order?
		 * Let's suppose we start from 0.
		 * Level 1 --> Node 0 visited
		 * Level 2 --> Node 1 and Node 3 visited
		 * Level 3 --> Node 2 visited
		 * Level 4 --> Node 4 visited
		 * 
		 * So using BFS we can traverse the graph level by level.
		 * In this algorithm we usually use queue data structure. Queue data structure 
		 * let's first in first out, so the element inserted into this data structure 
		 * first will be first to be removed from the queue. So we are using queue because
		 * it will help us in traversing the nodes of a graph level by level. We applied
		 * same algorithm while we are traversing the tree. But there is a slight catch in
		 * the graph. Because in the graphs it may contain a cycle so therefore we need to
		 * keep track of the nodes which have been visited. We usually keep the track of the 
		 * nodes into a boolean array.
		 */
		
		_ListImpl listImpl = new _ListImpl(5);
		listImpl.addEdge(0, 1);
		listImpl.addEdge(1, 2);
		listImpl.addEdge(2, 3);
		listImpl.addEdge(3, 0);
		listImpl.addEdge(2, 4);

		System.out.println(listImpl);	
		
		System.out.println("Breadth First Search : ");
		listImpl.bfs(0);
		System.out.println("");
		System.out.println("*************************");
	}
	
	private void depthFirstSearch() {
		
		/*
		 * Depth First Search (DFS)
		 * Iterative Way

                   [[0]]----------[[1]]
                     |              |
                     |              |
                     |              |   [[4]]
                     |              |   /
                     |              |  /
                   [[3]]----------[[2]]
                   
		 * We will discuss the iterative way to perform depth first search traversal of a graph.
		 * Here, you can see that we are given an undirected graph. So by undirected graph we 
		 * mean that i just don't have a direction. So if you are on any particular node, let's
		 * say 0, then we can go to 1. And if you are on 1, then we can go to 0. So the edges
		 * don't have any direction. Therefore, this is an undirected graph. So you are going to
		 * see the algorithm to perform that first search of undirected graph. We are using Stack
		 * in this algorithm.
		 */
		
		_ListImpl listImpl1 = new _ListImpl(5);
		listImpl1.addEdge(0, 1);
		listImpl1.addEdge(1, 2);
		listImpl1.addEdge(2, 3);
		listImpl1.addEdge(3, 0);
		listImpl1.addEdge(2, 4);

		System.out.println(listImpl1);	
		
		System.out.println("Depth First Search : ");
		listImpl1.dfs(0);
		System.out.println("");
		System.out.println("*************************");
		
		
		/*
		 * Depth First Search (DFS)
		 * Recursive Way

                   [[0]]----------[[1]]
                     |              |
                     |              |
                     |              |   [[4]]
                     |              |   /
                     |              |  /          [[5]]
                   [[3]]----------[[2]]
                   
		 * We can see here, 0, 1, 2, 3, 4 they are connected together. But there is one more node
		 * which is 5. So this vertex is not connected with the rest of the elements. So basically,
		 * a graph is provided like that, there could be components, which are basically disconnected.
		 * So we need to visit this graph, and it's each vertex. So here we actually use the for loop
		 * which drives each and every vertex and help us visiting the vertex using their first search.
		 */
		
		_ListImpl listImpl2 = new _ListImpl(6);
		listImpl2.addEdge(0, 1);
		listImpl2.addEdge(1, 2);
		listImpl2.addEdge(2, 3);
		listImpl2.addEdge(3, 0);
		listImpl2.addEdge(2, 4);
		
		System.out.println(listImpl2);	
		
		listImpl2.dfs();
		System.out.println("");
		System.out.println("*************************************");
	}
}
