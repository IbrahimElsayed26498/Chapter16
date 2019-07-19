/*
In the name of Allah, the Gracious, the Merciful
 */
package periorityqueuetest;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author ibrahim
 */
public class PeriorityQueueTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		// queue of capacity 11
		PriorityQueue<Double> queue = new 
			PriorityQueue<>(3, Collections.reverseOrder()); // reverseOrder : reversed the nutural order of 
															// collection that implenments comparator
		// insert elements to queue
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		System.out.print("Polling from queue: ");
		// display elements in queue
		while (queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek()); // view top element
			queue.poll(); // remove top element
		}
		System.out.println();
	}

}
