package data_structures_and_algorithms;

import data_structures_and_algorithms.a_complexity.Complexities;

public class DSAndAlgorithms {

	public static void main(String[] args) {

		Complexities complexity = new Complexities();
		complexity.timeComplexity();
		
		
	}
	
	public static void introductionToDataStructures() {
		
		/*
		 * Data Structures
		 * 
		   - It is a way to organize data.
		   - After organizing data, it becomes easy to process it.
		   	 For example: In library there are unorganized books. If they are not organized you can not find wanted book.
		 */
		
		/*
		 * Types of Data Structures:
		   - Linear Data Structures
		     They have the data elements arranged in a sequential manner. And they are sequentially so that
		     each member is connected to it's previous and next element. And as they are connected sequentially,
		     it becomes easy to traverse them and usually, the traversal is single level.
		     Some of linear data structures are as follows:
		     - Array
		     - Linked List
		     - Stack
		     - Queue
		   - Non-Linear Data Structures
		     By this term non-linear, we mean that the data element inside these data structures are not in sequence.
		     They are basically connected to one another through different paths. And as in linear data structure, 
		     they were single-level, but in non-linear data structure the elements are basically stored in multilevel
		     as they are multi-level. So in order to traverse each and every element in these non-linear data structures
		     takes some amount of time. As they are multi-level, traversing in this non-linear data structures is bir
		     difficult. So some of the examples of non-linear data structures are:
		     - Tree
		     - Graph
		 */
	}

	public static void introductionToAlgorithms() {
		
		/*
		 * Algorithms
		 * 
		   - An algorithm is a set of instructions to perform a task or to solve a given problem. For example, A recipe 
		     book is a collection of recipes in which each recipe provides an step by step introduction to prepare food.
		     For example we have a problem which we are wanted to print average of 3 given numbers. So, the steps would be:
		     - Get 3 numbers
		     - Perform sum of 3 numbers
		     - Store it in a variable sum
		     - Divide the sum by 3
		     - Store the value in variable avg.
		     - Print the value stored in avg.
		     
		     - The code would be:
		       
		       public void findAvg(int a, int b, int c){
		       		int sum = a + b + c;
		       		ing avg = sum / 3;
		       		System.out.println(avg);
		       } 
		 */
		
		/*
		 * Analysis of Algorithm
		 * 
		   - An algorithm is a set of instructions to perform a task or to solve a given problem.
		   - There are several different algorithms to solve a given problem.
		   - Analysis of algorithm deals in finding best algorithm which runs fast an takes in less memory.
		   - For example --
		     Q. Find sum of first n natural numbers
		        a) Input: n = 4
		           Output: 10 i.e. (1 + 2 + 3 + 4)
		           
             A. 1) public int findSum(int n) {
	                   return n * (n + 1) / 2;
			       }
	               
			    2) public int findSum(int n) {
	                   int sum = 0;
                       for(int i = 1; i <= n; i++) {
                           sum = sum + i;
                       }
                       return sum;
			       }
	               
		 * So we can see, these are the two algorithms which can solve our problem of finding the sum of first n
		 * natural numbers, but is there any way to figure out that algorithm is better than other?
		 * So in order to determine the best algorithm among these two algorithms, we usually check two things:
		   1) Time Complexity: How much time these algorithms are taking to complete?
		   2) Space Complexity: How much memory these algorithms is taking to complete?
		 */
	}
}
