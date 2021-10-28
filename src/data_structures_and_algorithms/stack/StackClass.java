package data_structures_and_algorithms.stack;

import java.util.Iterator;

import data_structures_and_algorithms.stack._Stack.Node;

public class StackClass {

	/*
	 * Stack Data Structure in Java
	 * 
	 * What is a Stack?
	   
	   - It is a one-ended linear data structure which models a real world stack by having two primary
	     operations namely push and pop.
	   - It is an ordered list in which insertion and deletion are done at one end, called as top.
	   - The last element inserted is the first one to be deleted. Hence, it is called Last In First Out
	     (LIFO) list.
	   - We call it a linear data structure because it can be represented by a linked list or an array
	     in which the nodes are adjacent to each other.
	     
	     top
	     ||
	     || 
	     \/
	    [10][] --> [4][] --> [7][] --> [25][] --> null
	 
	 *  When the stack is empty, top points the null.
	    
	     
	 *           push              pop
	 *  ||data|| --->              ---> ||data||
	 *                ||        ||
	 *                ||  data  ||
	 *                ||  data  ||
	 *                ||  data  ||
	 *                ||________||
	 *  
	 *  Notice that there is a top pointer pointing to the block at the top of the stack.This is because
	 *  elements in a stack always get removed and added to the top of the pile. 
	 *  
	 *  When and where is a Stack used?
		
		- Used by undo mechanisms in text editor.
		- Used in compiler syntax checking for matching brackets and braces.
		- Can be used to model a pile of tools or plates.
		- Used behind the scenes to support recursion by keeping track of previous function calls.
		- Can be used to do a Depth First Search (DFS) on a graph. 
	 */    
	
	public void stack() {
		
		/*
		 * How to implement Stack in Java?
		 */
		
		_Stack<Integer> stack = new _Stack<Integer>();		
		stack.push(19);
		stack.push(5);
		stack.push(7);
		stack.push(13);
		stack.push(4);
		
		System.out.println("Stack created : ");
		stack.print();
		System.out.println("******************************");
		
		System.out.println("Top element : " + stack.peek());
		System.out.println("******************************");
		
		System.out.println("Remove top element : " + stack.pop());
		System.out.println("New top element : " + stack.peek());
		stack.print();
		System.out.println("******************************");
		
		/*
		 * Reverse String By Using Stack
		 */
		String reversedString = reverseString("example word");
		System.out.println("Reversed string by using stack: " + reversedString);
		System.out.println("*******************************************");
	}
	
	private String reverseString(String word) {
		
		_Stack<Character> stack = new _Stack<Character>();
		char[] array = word.toCharArray();
		for (int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
		return new String(array);
	}
}
