package data_structures_and_algorithms.queue;

public class _Queue<T> {

	private Node front;
	private Node rear;
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
	
	public _Queue() {
		front = null;
		rear = null;
		length = 0;
	}

	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}
	
	public void print() {
		Node current = front;
		System.out.print("front --> ");
		while (current != null) {
			System.out.print(current.getData() + " --> ");
			current = current.next;
		}
		System.out.println("rear --> null");
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enqueue(T data) {
		Node node = new Node(data);
		
		if (isEmpty()) {
			front = node;
		}
		else {
			rear.next = node;
		}
		rear = node;
		length++;
	}

	public T dequeue() {
		if (isEmpty()) {
			System.out.println("There is no element to remove");
			return null;
		}
		
		T deleted = front.data;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		
		length--;
		return deleted;
	}
}
