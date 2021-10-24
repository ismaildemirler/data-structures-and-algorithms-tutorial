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
		 * 
		 * We saw how time and space affects the performance of an algorithm. But usually we don't go by the exact numbers,
		 * that how much exact time an algorithm is taking or how much space in numbers an algorithm is taking. So usually
		 * there are mathematical models which helps us in determining the time and space complexity of an algorithm. 
		 * Analysis which deals with those mathematical models we term them as asymptotic analysis.
		 * 
		 * So what do we mean by asymptotic analysis?
	       - Asymptotic analysis helps in evaluating performance of an algorithm in terms of input size and it's increase.
	       - Using asymptotic analysis, we don't measure actual running time of algorithm. It helps in determining how much
	       	 time and space taken by algorithm increases with input size.
	       - When we perform the analysis, there are certain notations which we need to know to perform the asymptotic analysis.
		 */
		
		/*
		 * Asymptotic Notations
		 * 
		 * Asymptotic analysis helps in evaluating performance of an algorithm in terms of input size and it's increase. 
		 * So usually this asymptotic analysis  is being done by asymptotic notations. 
		 * 
		 * So what do we mean by asymptotic notations?
	       - Asymptotic Notations are the mathematical tools used to describe the running time of an algorithm in term of 
	         input size.
	       - For better understanding let's consider an example: Performance of car in 1 litre of petrol.
	         Let's say you go to a car showroom where you want to purchase a car, so the mostly you will look into the design 
	         of the car and to the salesman, you will ask, what is the performance of car in 1 litre of petrol? How much the 
	         car travels by using 1 litre of petrol? So basically, the salesman will never give you an exact answer, he will
	         simply give you the numbers based on certain conditions the car is running. So he will simply tell you that if 
	         you are running this car on a highway where the traffic is very minimum, this car can give you a mileage of 25 
	         kilometers per litre. And if you are running it in the city where the traffic is maximum, it will give you 15 
	         kilometers per litre. And if you are running it in the city and a highway mixed, it will give you 20 kilometers 
	         per litre. So these answers the salesman might give you when you ask about the performance of the car. 
	         
	         - Highway (Minimum Traffic) --> 25 km/litre
	         - City + Highway (Average Traffic) --> 20 km/litre
	         - City (Maximum Traffic) --> 15 km/litre	         
	         
	         So when we talk an algorithm, these asymptotic notations gives us this rough idea of how an algorithm will be performing 
	         in certain situations. So here, Asymptotic Notations help us in determining:
	         
	         - Best Case
	         - Average Case
	         - Worst Case
	         
	         So we can simply relate this analogy to these conditions the best case would be that if you are driving on a highway,
	         the average case would be that you are driving in both city and highway. The worst case would be that if you are driving 
	         in city. So this is how Asymptotic Notations provide us an in-depth description about the running of time of an algorithm
	         in terms of it's input size.
		 */
		
		/*
		 * Types of Asymptotic Notations
		 * 
		   - There are three notations for performing runtime analysis of an algorithm. 
		     - Omega Notation (Ω-notation)
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
