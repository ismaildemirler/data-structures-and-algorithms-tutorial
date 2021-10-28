package data_structures_and_algorithms.tree;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import data_structures_and_algorithms.tree._BinaryTree.Node;

import com.sun.source.tree.Tree.Kind;

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
}
