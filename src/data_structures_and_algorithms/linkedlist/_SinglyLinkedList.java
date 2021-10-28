package data_structures_and_algorithms.linkedlist;

public class _SinglyLinkedList {

	private Node head;
	
	public class Node {
		
		private int data;
		private Node next;
		
		public Node() {
			
		}
		
		public Node(int data) {
			this.setData(data);
			this.setNext(null);
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public int length() {
		if (head == null) {
			return 0;
		}
		
		int count = 0;
		Node current = head;
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	public void addToBeginning(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void addToEnd(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void insertAt(int index, int value) {
		if (index < 1) {
			System.out.println("Please write a valid index!");
			return;
		}	
		
		if (index > length() + 1) {
			System.out.println("Index is bigger than length of the list!");
			return;
		}

		Node newNode = new Node(value);
		
		if (index == 1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node previous = head;
			
			int count = 1;
			while (count < index - 1) {
				previous = previous.next;
				count++;
			}
			
			Node current = previous.next;
			newNode.next = current;
			previous.next = newNode;
		}
	}

	public Node deleteFirst() {
		if (head == null) {
			System.out.println("You have no element in the list!");
			return null;
		}
		
		Node deleted = head;
		head = head.next;
		deleted.next = null;
		return deleted;
	}

	public Node deleteLast() {
		if (head == null || head.next == null) {
			System.out.println("You have no element in the list!");
			return head;
		}
		
		Node current = head;
		Node previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		
		previous.next = null;
		return current;
	}
	
	public Node deleteAt(int index) {
		if(head == null) {
			System.out.println("You have no element in the list!");
			return null;
		}
		
		if (index < 1) {
			System.out.println("Please write a valid index!");
			return null;
		}	
		
		if (index > length() + 1) {
			System.out.println("Index is bigger than length of the list!");
			return null;
		}
		
		Node deleted = null;
		if(index == 1) {
			deleted = head;
			head = head.next;
			deleted.next = null;
			return deleted;
		}
		else {
			Node previous = head;
			int count = 1;
			while(count < index - 1) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next = current.next;
			return current;
		}
	}
	
	public Node getByValue(int value) {
		Node current = head;
		
		while(current.next != null) {
			if(current.data == value) {
				return current;
			}
			current = current.next;
		}
		return new Node();
	}
	
	public boolean contains(int value) {
		Node current = head;
		
		while(current.next != null) {
			if(current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public Node reverseRecursively() {
		return reverseRecursively(head);		
	}
	
	public Node reverseIteratively() {
		return reverseIteratively(head);
	}
	
	private Node reverseRecursively(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
		 
		Node current = reverseRecursively(node.next);
		node.next.next = node;
		node.next = null;
		return current;
	}
	
	private Node reverseIteratively(Node head) {
		if (head == null) {
			return head;
		}
		
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public Node findMiddle() {
		if (head == null) {
			return null;
		}
		
		Node slowPtr = head;
		Node fastPtr = head;
		
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}

	public Node findNthNodeFromTheEnd(int number) {
		if(head == null) {
			return null;
		}
		
		if (number <= 0) {
			System.out.println("Enter valid number!");
			return null;
		}
		
		Node mainPtr = head;
		Node refPtr = head;
		
		int count = 0;
		
		while (count < number) {
			if (refPtr == null) {
				System.out.println("Number is greater than the number of nodes in the list!");
				return null;
			}
			refPtr = refPtr.next;
			count++;
		}
		
		while (refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}

	public Node insertNodeInSortedList(int value) {
		Node node = new Node(value);		
		Node current = head;
		Node previous = null;
		
		while (current != null && current.getData() < value) {
			previous = current;
			current = current.next;
		}
		previous.next = node;
		node.next = current;
		return head;
	}
	
	public void deleteNode(int value) {
		Node current = head;
		Node previous = null;
		
		while(current != null && current.data != value) {
			previous = current;
			current = current.next;
		}
		
		previous.next = current.next;
	}
	
	public void printLinkedList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.getNext();
		}
		System.out.println("null");
		System.out.println("");
	}
}
