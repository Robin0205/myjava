package collec;

import java.util.PriorityQueue;

/* ----------------QUEUE--------------
 * it is also a child interface of collection interface
 * this interface is implemented by different classes(priority and linked list)
 * we will prefer this concept when will be priior to prefer concept
 *queue will internally follow  first in first out concept.
 *it has extended sub interfaces called  deque(i), blockqueue(i),blocking dqueue(i);
 *if we have group of elements that are prior to processing then we should go for queue method
 *every object or elemtn in classs have head and tail
 *inserion of element will takes place at tail and prior to process present at head part
 *Heterogrnous data is not allowed in priorirty class 
 *priorityqueue q=new priorityqueue();
 *we can read alla the data from queue interface  by iterator method also.
 *
 *
 * lined list                           priority
 * --inseriton allowed               ----insertion allowed
 * --duplicates                      ----duplicates
 * ---heterogenous                   ----not allowed
 
 */

public class queueee {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		
		//there are different methods that implemented the queue interface
		
		
		PriorityQueue p=new PriorityQueue();
       /*  p.offer("A");
        p.add("B");
		p.add("c");
		p.add("D");*/
		
		
		// add  and offer are methods by which we can add elements  to priority queue (add -t, exception) , offer(T, null)
		System.out.println(p.offer(p));
		
		
		
		// peak and element method that retain head element from queue  (element T,EXCEPTION)  PEAK( T,NULL)
		
		//System.out.println(p);
	//System.out.println(p.peek());	
	
	//methods to remove the elemnt from the queue
   //   System.out.println(p.poll());
		
	

	}

}
