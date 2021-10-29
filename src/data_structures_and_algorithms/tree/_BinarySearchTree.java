package data_structures_and_algorithms.tree;

public class _BinarySearchTree {

	private Node root;
	
	public class Node {
		 
		private int data; // Generic Type
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public _BinarySearchTree() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void insert(int value) {
		this.root = insert(this.root, value);
	}
	
	private Node insert(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		
		if (value < root.data) {
			root.left = insert(root.left, value);
		}
		else {
			root.right = insert(root.right, value);
		}
		
		return root;
	}

	public void print() {
		System.out.println("Binary Search Tree : ");
		preOrderTraversal(this.root);
		System.out.println("");
		System.out.println("***********************************");
	}
	
	private void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	public int search(int value) {
		return search(this.root, value) != null ? search(this.root, value).data : -1;
	}
	
	private Node search(Node root, int value) {
		if (root == null || root.data == value) {
			return root;
		}
		
		if (value < root.data) {
			return search(root.left, value);
		}
		else {
			return search(root.right, value);
		}
	}
}
