package data_structures_and_algorithms.stack;

public class _Stack<T> {

	private Node top;
	private int length;
	
	public class Node {
		private T data;
		private Node next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	public _Stack() {
		top = null;
		length = 0;
	}
	
	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void print() {
		Node current = top;
		System.out.print("top --> ");
		while (current != null) {
			System.out.print(current.getData() + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void push(T value) {
		Node node = new Node(value);
		node.next = top;
		top = node;
		length++;
	}
	
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. You can not pop!");
		}
		T result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return top.getData();
	}
}
