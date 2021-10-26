package data_structures_and_algorithms.b_linkedlist;

import data_structures_and_algorithms.b_linkedlist._SinglyLinkedList.Node;

public class LinkedListClass {
	
	/*
	 * Linked List in Java
	 * 
	 * Linked List is a sequential list of nodes that hold data which point to other nodes also containing data.
	 *
	 * Where are Linked List used?

	   - Used in many List, Stack and Queue implementations.
	   - Great for creating circular lists.
	   - Can easily model real world objects such as trains.
	   - Often used in the implementations of adjacency list of graphs.
	   - Used in separate chaining which is present certain HashTable implementations to deal with hashing collisions.
	 
	 * Terminology:
	   - Head     : The first node in a Linked List.
	   - Tail     : The last node in a Linked List.
	   - Pointer  : Reference to another node.
	   - Node     : An object containing data and pointers. 
	 */

	public void singlyLinkedList() {
		
		/*
		 * Singly Linked List in Java
		 * 
		 * Singly Linked List is a data structure used for storing collection of nodes and has following properties:
		 
		   - It contains sequence of nodes.
		   - A node has data and reference to next node in a list.
		   - First node is the head node.
		   - Last node has data and points to null.

		    Node
		 * |data|pointer points next| --> null
		 
	        HEAD                                          TAIL
		 * |10|*|----> |8|*|----> |1|*|----> |11|*|----> |15|*|----> null
		 * 
		 * The head node is responsible to hold this complete Singly Linked List.
		 
		   //Generic Type
		   public class Node<T> {
		       private T data;
		       private ListNode<T> next;
		   }
		   
		   //Integer Type
		   public class Node {
		       private int data;
		       private ListNode next;
		   }
		   
		 * Singly Linked List only holds a reference to the next node. In the implementation, you always maintain
		 * a reference to the head to the Linked List and a reference to the tail node for quick additions or
		 * removals.
		 */
		
		/*
		 * How to create Singly Linked List
		 */
		
//		head is instance variable
//		head = new Node(10);
//		Node second = new Node(1);
//		Node third = new Node(8);
//		Node fourth = new Node(11);
		
		/*
		 * Result of above code below shows up:

		   head --> ||10||*|| --> null
		   second --> ||1||*|| --> null
		   third --> ||8||*|| --> null
		   fourth --> ||11||*|| --> null
		 */
		
//		head.next = second;
//		second.next = third;
//		third.next = fourth;
		
		/*
		 * Result of above code below we can see last state of Linked List:

		   head ---> |10|*|----> |8|*|----> |1|*|----> |11|*|----> null
		   
		   head points 10 here.
		 */
		
		/*
		 * Create Singly Linked List Code
		 */
		
		_SinglyLinkedList singlyLinkedList = new _SinglyLinkedList();				
		
		singlyLinkedList.setHead(singlyLinkedList.new Node(10));
		Node second = singlyLinkedList.new Node(1);
		Node third = singlyLinkedList.new Node(8);
		Node fourth = singlyLinkedList.new Node(11);
		Node fifth = singlyLinkedList.new Node(5);
		
		Node head = singlyLinkedList.getHead();
		head.setNext(second);   // 10 --> 1
		second.setNext(third);  // 10 --> 1 --> 8
		third.setNext(fourth);  // 10 --> 1 --> 8 --> 11
		fourth.setNext(fifth);  // 10 --> 1 --> 8 --> 11 --> 5 --> null
		
		System.out.println("Singly Linked List: ");
		singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
		System.out.println("*********************************************");
		
		/*
		 * Get length of the Linked List
		 */
		System.out.println("Length of The Singly Linked List: " + singlyLinkedList.length());
		System.out.println("*********************************************");
		
		/*
		 * Inserting Node at the beginning of the Linked List
		 */
		singlyLinkedList.addToBeginning(7);
		System.out.println("Singly Linked List after Adding 7 to beginning: ");
		singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
		System.out.println("*********************************************");
		
		/*
		 * Inserting Node at the end of the Linked List
		 */
		singlyLinkedList.addToEnd(33);
		System.out.println("Singly Linked List after Adding 33 to end: ");
		singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
		System.out.println("*********************************************");
		
		/*
		 * Inserting Node at given index of the Linked List
		 */
		singlyLinkedList.insertAt(5, 100);
		System.out.println("Singly Linked List after inserting 100 at 5. index: ");
		singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
		System.out.println("*********************************************");
		
		/*
		 * Deleting Node first index of the Linked List
		 */
		System.out.println("Deleted element: " +  singlyLinkedList.deleteFirst().getData());
		System.out.println("Singly Linked List after deleting first element: ");
		singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
		System.out.println("*********************************************");
		
		/*
		 * Deleting Node last index of the Linked List
		 */
		System.out.println("Deleted element: " +  singlyLinkedList.deleteLast().getData());
		System.out.println("Singly Linked List after deleting last element: ");
		singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
		System.out.println("*********************************************");
		
		/*
		 * Deleting Node at given index of the Linked List
		 */
		System.out.println("Deleted element: " +  singlyLinkedList.deleteAt(5).getData());
		System.out.println("Singly Linked List after deleting given element: ");
		singlyLinkedList.printLinkedList(singlyLinkedList.getHead());
		System.out.println("*********************************************");
	}
}
