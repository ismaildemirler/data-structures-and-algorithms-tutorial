package data_structures_and_algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import data_structures_and_algorithms.tree._BinaryTree.Node;

public class _BinaryTree {

	private Node root;
	
	public class Node {
		private int data; //Generic type
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	
	public _BinaryTree() {
		this.root = null;
	}
	
	public Node getRoot() {
		return root;
	}

	
	public void setRoot(Node root) {
		this.root = root;
	}

	public void create() {
		Node first = new Node(3);
		Node second = new Node(2);
		Node third = new Node(8);
		Node fourth = new Node(4);
		Node fifth = new Node(11);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		
		root = first; // root --> first
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
	}

	public void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public void preOrderTraversal() {
		if (root == null) {
			return;
		}
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node current = stack.pop();
			
			if (current.right != null) {
				stack.push(current.right);
			}

			System.out.print(current.data + " ");
			
			if (current.left != null) {
				stack.push(current.left);
			}
		}
	}

	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}

	public void inOrderTraversal() {
		if (root == null) {
			return;
		}
		
		Stack<Node> stack = new Stack<Node>();
		Node current = root;

		while (!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			}
			else {
				current = stack.pop();			
				System.out.print(current.data + " ");
				current = current.right;
			}
		}
	}

	public void postOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

	public void postOrderTraversal() {
		if(root == null) {
			return;
		}
		
		Node current = null;		
		Stack<Node> stack = new Stack<Node> ();		
		while(root != null || !stack.empty()){
			if(root != null){				
				stack.push(root);
				root = root.left;
			}
			else{
				root = stack.peek();
				if(root.right == null || root.right == current){
				    stack.pop();
				    current = root;
				    root = null;
				}
				else {
				    root = root.right;
				}
			}
		}
	}

	public void levelOrderTraversal() {
		if (root == null) {
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.data + " ");
			if (current.left != null) {
				queue.offer(current.left);
			}
			if (current.right != null) {
				queue.offer(current.right);
			}
		}
	}

	public int findMaximumNumber(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		
		int result = root.data;
		int left = findMaximumNumber(root.left);
		int right = findMaximumNumber(root.right);
		
		if (left > result) {
			result = left;
		}
		if (right > result) {
			result = right;
		}
		
		return result;
	}
}
