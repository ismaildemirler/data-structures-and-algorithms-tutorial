package data_structures_and_algorithms.queue;

public class QueueClass {

	/*
	 * Queue Data Structure in Java
	 * 
	 * What is a Queue?

	   - A Queue is a linear data structure which models real world queues by having two primary operations,
	     namely enqueue and dequeue
	   - It is an ordered list in which insertion are done at one end called as rear and deletion are done
	     at other end called as front.
	   - The first element inserted is the first one to be deleted. Hence it is called as First In First Out
	     (FIFO) list.
	     
	     front                                    rear
	      ||                                       ||
	      ||                                       ||
	      \/                                       \/
	     [5][] --> [8][] --> [13][] --> [7][] --> [3][] --> null
	     
	     					             Queue
	     		             ____________________________
	     	   Exit                                                 Enter
	        <--------        ____________________________         <---------
	 
	 *  When a Queue is empty front points to null and rear points to null.
	 */
	
	public void queue() {
		
		/*
		 * How to implement Queue in Java
		 */
		
		_Queue<Integer> queue = new _Queue<Integer>();
		queue.enqueue(5);
		queue.enqueue(1);
		queue.enqueue(8);
		queue.enqueue(4);
		queue.enqueue(9);
		queue.enqueue(14);
		
		System.out.println("Queue created : ");
		queue.print();
		System.out.println("***************************************");
		
		System.out.println("Removed element : " + queue.dequeue());
		System.out.println("Queue after removing : ");
		queue.print();
		System.out.println("***************************************");
	}
}
