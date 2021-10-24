package data_structures_and_algorithms.a_complexity;

public class Complexities {

	public void timeComplexity() {
		
		/*
		 * Time Complexity
		 * 
		   - It is amount of time taken by algorithm to finish steps and give result.
		   - The input processed by an algorithm helps in determining the time complexity.		   
		 */
		
		/*
		 * We have 2 algorithms which solves the problem. The input is same but way for solving is different.
		 * findSumByFormula() algorithm solves problem by using the mathematical formula, which is directly
		 * putting the values inside the formula and returning the sum of first n natural numbers.
		 * But findSumByLoop() algorithm uses for loop that means we are simply running the statement n times.
		 * So it is dependent the input (n). We can say that if the value of n gets larger than the statement
		 * will run more. So the time taken by this algorithm will be more than other algorithm because we are
		 * processing an input based on a for loop.
		 * We can say that findSumByFormula() algorithm is much more efficient than findSumByLoop() algorithm.
		 * Because in findSumByFormula() algorithm there is only one statement, which is a constant statement.
		 * But in findSumByLoop() algorithm we are iterating in a for loop where the line in for loop gets 
		 * executed for a number of n times. So below, we are trying to learn how much time these algorithms 
		 * are taking.
		 */
		
		double now = System.currentTimeMillis();
		
		int result1 = findSumByFormula(999999999);
		
		System.out.println("We got result " + result1 
				+ " from findSumByFormula(99999) algorithm in "
				+ ((System.currentTimeMillis() - now) / 1000) + " seconds");
		
		System.out.println("***************************************************");
		
		now = System.currentTimeMillis();
		
		int result2 = findSumByLoop(999999999);
		
		System.out.println("We got result " + result1 
				+ " from findSumByLoop(99999) algorithm in "
				+ ((System.currentTimeMillis() - now) / 1000) + " seconds");

		System.out.println("***************************************************");
		
		/*
		 * So here, we can see that, though, we have two algorithms which solves our problem, we usually do
		 * the analysis of the algorithms to get the best algorithm out of the options. And calculating the 
		 * time taken by findSumByLoop() algorithm is also not a good idea because it depends to input size.
		 */
	} 
	
	public void spaceComplexity() {
		
		/*
		 * Space Complexity
		 * 
		   - It is amount of memory or space taken by algorithm to finish steps and give the result
		 
		 * We will consider two algorithms findSumByFormula() and findSumByLoop() from the angle of space complexity.
		 */
		
		/*
		 * The other constraint which helps determining that which algorithm is better is space complexity. So usually
		 * we even measure that how much space these algorithms are taking. And whichever is taking the less memory,
		 * we simply choose that algorithm. Because when we run these algorithms with the system having so many users,
		 * it may happen that our memory get exhausted. So we try to fit in the best algorithm which takes less memory.
		 * So here, when we calculate the time and space complexity we never go into the exact numbers. There are certain
		 * mathematical tools which helps us in determining the time and space complexity of an algorithm. And we usually
		 * term them asymptotic analysis of an algorithm.
		 */
	}
	
	private void asymptoticAnalysis() {
		
		/*
		 * Asymptotic Analysis of An Algorithm
		 */
	}
	
	public int findSumByFormula(int n) {
   		return n * (n + 1) / 2;
    }
	
	public int findSumByLoop(int n) {
   		int sum = 0;
   		for(int i = 1; i <= n; i++) {
   			sum = sum + i;
   		}
   		return sum;
   	}
}
