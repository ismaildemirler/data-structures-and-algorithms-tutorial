package data_structures_and_algorithms.tree;

import java.util.Iterator;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import data_structures_and_algorithms.tree._BinaryTree.Node;

public class TreeClass {
	
	/*
	 * Tree Data Structure in Java
	
	   - It is a non-linear data structure used for storing data
	   - It is made up of nodes and edges without having any cycle
	   - Each node in a tree can point to n number of nodes in a tree
	   - It is a way of representing hierarchical structure with a parent node called as root and many
	     levels of additional nodes.
	     						     A Tree Representing Example
	     									
	                                           [[1]] ---> root
	                                         /   |   \
	                                    [[2]]  [[9]]  [[3]] 
	                                   /     \       /     \
	                              [[4]]     [[5]]  [[6]]    [[7]] ---> leaf (has no child)
	                              
	 * What is Binary Tree?
	 * A tree is called as Binary Tree, if each node has zero, one or two children.
						
									    A Binary Tree Example
										
                                                [[1]]  --> root
                                             /         \
                                        [[2]]           [[3]]
                                       /     \         /     \
                          leaf ---> [[4]]   [[5]]   [[6]]   [[7]] --> leaf
	 					  
	 					       
                             null <--- [[left]][[data]][[right]] ---> null
                                               TreeNode
	 					                       
	 * So a binary tree is basically represented by a tree node. So here you can tree node consists of
	 * three things. One is data part which holds the data and pointer in the left which points the left
	 * node and pointer in the right which points to the right node. In a Tree which has no elements, 
	 * root points null.
	 */  
	
	public void binaryTree() {
		
		_BinaryTree binaryTree = new _BinaryTree();
		binaryTree.create();
		
		/*
		 * We have created binary tree above. So now we want to traverse the tree.
		 * 
		 * There are 3 types of traversal:
		   - Pre Order Traversal
		   - In Order Traversal
		   - Post Order Traversal
		   
		 */
		
		/*
		 * Pre Order Binary Tree Traversal

		   - Visit the root node
		   - Traverse the left subtree in pre order fashion
		   - Traverse the right subtree in pre order fashion
		 */
		
		System.out.println("Pre order traversal of the binary tree recursively: ");
		binaryTree.preOrderTraversal(binaryTree.getRoot());
		
		System.out.println("");
		System.out.println("*********************************");
		
		System.out.println("Pre order traversal of the binary tree iteratively: ");
		binaryTree.preOrderTraversal();

		System.out.println("");
		System.out.println("*********************************");
		
		/*
		 * In Order Binary Tree Traversal

		   - Traverse the left subtree in In Order fashion
		   - Visit the root node
		   - Traverse the right subtree in In Order fashion
		 */
		
		System.out.println("In order traversal of the binary tree recursively: ");
		binaryTree.inOrderTraversal(binaryTree.getRoot());
		
		System.out.println("");
		System.out.println("*********************************");
		
		System.out.println("In order traversal of the binary tree iteratively: ");
		binaryTree.inOrderTraversal();

		System.out.println("");
		System.out.println("*********************************");
		
		/*
		 * Post Order Binary Tree Traversal

		   - Traverse the left subtree in Post Order fashion
		   - Traverse the right subtree in Post Order fashion
		   - Visit the node
		 */
		
		System.out.println("Post order traversal of the binary tree recursively: ");
		binaryTree.postOrderTraversal(binaryTree.getRoot());
		
		System.out.println("");
		System.out.println("*********************************");
		
		System.out.println("Post order traversal of the binary tree iteratively: ");
		//binaryTree.postOrderTraversal();
		
		System.out.println("");
		System.out.println("*********************************");
		
		/*
		 * Level Order Binary Tree Traversal
		 */
		System.out.println("Level order traversal of the binary tree iteratively: ");
		binaryTree.levelOrderTraversal();
		
		System.out.println("");
		System.out.println("*********************************");
		
		/*
		 * Find Maximum Number Node in Binary Tree Recursively
		 */
		
		System.out.println("Maximum Number In The Binary Tree : " 
				+ binaryTree.findMaximumNumber(binaryTree.getRoot()));
		System.out.println("*********************************************");
	}

	public void binarySearchTree() {
		
		/*
		 * Binary Search Tree In Java
		 */
		
		/*
		 * What is a Binary Search Tree?
		 * 
		 * It is a type of Binary Tree in which data is organized in an ordered manner which helps in 
		 * faster search and insertion of data. It satisfies following properties:

		   - The left subtree of a node contains only nodes with values lesser than the node's value.
		   - The right subtree of a node contains only nodes with values greater than the node's value.
		   - The left and right subtree each must also be a binary search tree.
		 */
		
		/*
		 * Generating Binary Search Tree
		 */
		
		_BinarySearchTree searchTree = new _BinarySearchTree();
		
		searchTree.insert(7);
		searchTree.insert(4);
		searchTree.insert(9);
		searchTree.insert(11);
		searchTree.insert(3);
		searchTree.insert(2);
		searchTree.insert(5);
		searchTree.insert(8);
		searchTree.insert(6);
		
		searchTree.print();
		
		/*
		 * Searching A Key in Binary Search Tree
		 */
		int node = searchTree.search(1);
		System.out.println("Wanted Node : " + node);
		System.out.println("***************************************");
	}

	public void matrixExample() {
		
		/*
		 * Q. Given a row and column wise (nxn) sorted matrix. Write a program to seacrh a key in a given matrix.
		   
		   _______________________	
		   ||                   ||
		   || 10 | 20 | 30 | 40 ||
		   ||-------------------||
		   || 15 | 25 | 35 | 45 ||
		   ||-------------------||
		   || 27 | 29 | 37 | 48 ||
		   ||-------------------||
		   || 32 | 33 | 39 | 51 ||
		   ||___________________||
		          
		          matrix[][]
		   
		 */
		
		/*
		 * Answer:
		 */
		int[][] matrix = {
						  { 10, 20, 30, 40 }, 
						  { 15, 25, 35, 45 }, 
						  { 27, 29, 37, 48 }, 
						  { 32, 33, 39, 51 }
						 };
		searchInMatrix(matrix, 0, 0, 4, 48);
		System.out.println("*********************************");
		searchInSortedMatrix(matrix, 4, 33);
		System.out.println("*********************************");
	}
	
	private int searchInMatrix(int[][] matrix, int i, int j, int n, int wanted) {
		if (i >= n ||  j >= n) {
			return -1;
		}
		
		if (matrix[i][j] == wanted) {
			System.out.println(wanted + " has found at " + i + ". " 
					+ j + ". indexes");
			return wanted;
		}
		
		int result = searchInMatrix(matrix, i, ++j, n, wanted);
		if (result == -1) {
			j = 0;
			result = searchInMatrix(matrix, ++i, j, n, wanted);
		}
		
		if (result == -1) {
			result = searchInMatrix(matrix, ++i, ++j, n, wanted);
		}
		
		return result;
	}

	private void searchInSortedMatrix(int[][] matrix, int n, int wanted) {
		int i = 0; 
		int j = n - 1;
		
		while (i < n && j >= 0) {
			if (matrix[i][j] == wanted) {
				System.out.println(wanted + " has found at " + i + ". " 
						+ j + ". indexes");
				return;
			}
			if (matrix[i][j] > wanted) {
				j--;
			} 
			else {
				i++;
			}
		}
		System.out.println(wanted + " has not found!");
	}
}
