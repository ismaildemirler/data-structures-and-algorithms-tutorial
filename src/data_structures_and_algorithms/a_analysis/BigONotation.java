package data_structures_and_algorithms.a_analysis;

import java.util.Iterator;

public class BigONotation {

	/*
	 * Big-O Notation
	 * 
	 * We have listed Big-O Notations below:
	 
	   - O(1)       : Constant Time / Space
	   - O(log(n))  : Logarithmic Time / Space
	   - O(n)       : Linear Time / Space
	   - O(nlog(n)) : Loglinear Time / Space
	   - O(n^p)     : Polynomial Time / Space
	   - O(2^n)     : Exponential Time / Space
	   - O(n!)      : Factorial Time / Space
	   
	 */
	
	/*
	   - O(1)       : Excellent
	   - O(log(n))  : Good
	   - O(n)       : Fair
	   - O(nlog(n)) : Bad
	   - O(n^p)     : Terrible
	   - O(2^n)     : Terrible
	   - O(n!)      : Terrible
	 */
	
	/*
	 * Rules of Big-O Notation
	 * 
	 * Let's assume we have a computer which is a single processor machine. So let's say the algorithm 
	 * we have wrote, we are running it on the single processor and the processor is executing algorithms 
	 * sequentially. Then we simply assume that assignment operation takes 1 unit of time. So this 1 unit 
	 * of time can be anything. Let's say one second, one milisecond etc...
	     
	   int x = 5; --> 1 unit of time. (Constant time)
	     
	 * So if we encounter something like above, we pretty assume that it may take one unit of time. If we
	 * encounter return statement, it takes in 1 unit of time.
	     
	   return x; --> 1 unit of time. (Constant time)
	   
	 * If we encounter arithmetical operation, it takes 1 unit of time.
	 
	   x + y; / y * z; --> 1 unit of time. (Constant time)
	 
	 * If we encounter logical operation, it takes 1 unit of time.
	   
	   x && y --> 1 unit of time. (Constant time)
	   
	 * Other small / single operations take 1 unit of time.
	 * Drop lower order terms. Basically let's assume that we have a very large input size.

	   T = n^2 + 3n + 1 ---> O(n^2)
	   
	   Here, we ignore n^1 terms. Because they are nothing aside n^2 terms. They can be ignored. And of course
	   constant numbers can be ignored. So our Big-O is n^2.
	   
	 * Drop constant multipliers  

	   T = 3n^2 + 6n + 1 ---> O(n^2)
	   
	 */
	
	public void constantTime() {
		
		/*
		 * O(1) Time Complexity : Constant Time
		 
		   - Lookup by index for Array
		   - Inserting a node to beginning or ending of a Singly LinkedList
		   - push / pop on a Stack
		   - Enqueue / Dequeue on a Queue
		   - Insert / Remove / Lookup on a HashMap
		   - Insert / Remove / ContainsKey on a HashSet
		 */
		
		/*
		 * So this algorithm is O(1). This algorithm complexity is O(1);
		 */
		int result1 = constantTimeExample1(5, 6);	
		System.out.println("Result1 of algorithm which is O(1) time complexity: " + result1);
		
		/*
		 * So this algorithm is O(1). This algorithm complexity is O(1);
		 */
		int result2 = constantTimeExample2(new int[]{1, 2, 3}, 2);
		System.out.println("Result2 of algorithm which is O(1) time complexity: " + result2);
		
		System.out.println("*******************************************************");
		
		
		/*
		 * Time Complexity of Polynomial Algorithms
		 */
		
		/*
		 * So this algorithm is O(n^2). This algorithm complexity is O(n^2);
		 */
		polynomialTimeExample(10);
	}

	public void logarithmicTime() {
		
		/*
		 * O(log(n)) Time Complexity : Logarithmic Time
		 
		   - Insert / Remove / Lookup on a Binary Tree
		   - Many Divide and Conquer algorithms
		 */
		
		logarithmicTimeExample(8);
		System.out.println("************************************");
	}
	
	public void linearTime() {
		
		/*
		 * O(n) Time Complexity : Linear Time
		 
		   - Lookup by value for an Array
		   - Insert / Remove on an Array
		   - Lookup by value / index on a LinkedList
		   - Insert on the middle of a Singly LinkedList
		   - Linear Search
		   - Count Sort
		   - Bucket Sort
		   - Comparing two Strings
		 */
		
		/*
		 * So this algorithm is O(n). This algorithm complexity is O(n);
		 */
		int sum = linearTimeExample(10);
		System.out.println("Result of algorithm which is O(n) time complexity: " + sum);
		System.out.println("************************************");
	}
	
	public void logLinearTime() {
		
		/*
		 * O(nlog(n)) Time Complexity : Loglinear Time
		 
		   - Merge Sort
		   - Quick Sort
		 */
		
		logLinearTimeExample(10);
		System.out.println("************************************");
	}
	
	public void polynomialTime() {
		
		/*
		 * O(n^p) Time Complexity : Polynomial Time
		 
		   - Nested for loops
		   - Bubble Sort
		   - Selection Sort
		   - Insertion Sort
		 */
		
		/*
		 * O(n^2) --> Quadratic
		 * O(n^3) --> Cubic
		 * O(n^4) --> Quadric
		 */
	}

	public void exponentialTime() {
		
		/*
		 * O(2^n) Time Complexity : Exponential Time
		 
		   - Not common
		   - Avoid to get it!
		   - Tower of Hanoi Example
		 */
	}
	
	public void factorialTime() {
		
		/*
		 * O(n!) Time Complexity : Factorial Time
		 
		   - Avoid to get it!
		 */
	}
	
	private int constantTimeExample1(int x, int y) {
		
		/*
		 * This line is 1 unit of time so constant time. It is not dependent to inputs.
		 */
		int result = x + y; 
		
		/*
		 * This line is 1 unit of time so constant time. It is not dependent to inputs.
		 */
		return result;
	}
	
	private int constantTimeExample2(int[] arr, int i) {
		/*
		 * This line is 1 unit of time so constant time. It is not dependent to inputs.
		 * Because it is not dependent to size of array.  
		 */
		return arr[i];
	}

	private void logarithmicTimeExample(int n) {
		
		for (int i = 1; i <= n; i = i * 2) {
			System.out.println("Logarithmic time example " + i);
		}
	}
	
	private int linearTimeExample(int n) {
		
		/*
		 * This line is 1 unit of time so constant time. It is not dependent to inputs.
		 */
		int sum = 0;
		
		/*
		 * This for loop will run n times. Because it is dependent to n input.
		 * So this for loop is n unit of time. Time complexity is O(n).
		 */
		for (int i = 1; i <= n; i++) {
			/*
			 * This line will run n times. Because it is dependent to n input.
			 * So this line is n unit of time. Time complexity is O(n).
			 */
			sum = sum + i;
		}
		
		/*
		 * This line is 1 unit of time so constant time. It is not dependent to inputs.
		 */
		return sum;
	}

	private void logLinearTimeExample(int n) {
		
		/*
		 * This for loop will run n times. Because it is dependent to n input.
		 * So this for loop is n unit of time. Time complexity is O(n).
		 */
		for (int i = 1; i <= n; i++) {
			
			/*
			 * This for loop will run n times. Because of outer for loop
			 */
			for (int j = 1; j <= n; j = j * 2) {
				 
				System.out.println("Loglinear time example " + i);
			}
			//End of inner loop
		}
		//End of outer loop
	}
	
	private void polynomialTimeExample(int n) {
		
		/*
		 * This for loop will run n times. Because it is dependent to n input.
		 * So this for loop is n unit of time. Time complexity is O(n).
		 */
		for (int i = 1; i <= n; i++) {
			
			/*
			 * This for loop will run n times. Because of outer for loop
			 */
			for (int j = 0; j < n; j++) {
				
				/*
				 * This for loop will run n^2 times. Because of outer for loop
				 * this line will run n times. And also Because of inner for loop
				 * this line will run n times. So this for loop is n^2 unit of time. 
				 * Time complexity is O(n^2).
				 */
				
				//print to screen
			}
			//End of inner loop
		}
		//End of outer loop
	}
}
