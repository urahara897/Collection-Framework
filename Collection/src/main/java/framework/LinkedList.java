package framework;

import java.util.Deque;

import java.util.Iterator;

import org.testng.annotations.Test;

public class LinkedList {
	
	@Test
	public void test1() {
		
		Deque<String> deque = new java.util.LinkedList<String>();
		deque.add("One");
		deque.addFirst("Five");
		deque.addLast("Nine");
		deque.push("Two");
		deque.offer("Fifteen");
		deque.offerFirst("Eight");
		deque.offerLast("Four");
		System.out.println("Initial deque:");
		System.out.print(deque + " ");
		System.out.println("Deque Contents using standard Iterator");
		Iterator iterator = deque.iterator();
		while (iterator.hasNext()){
			
			System.out.println(" " + iterator.next());
			
		}
		
		Iterator reverse = deque.descendingIterator();
		System.out.println("Deque Contents using reverse Iterator");
        while (reverse.hasNext()){
			
			System.out.println(" " + reverse.next());
			
		}
		
		System.out.println("Deque Peek:" + deque.peek());//first element
		System.out.println("Deque After Peek:" + deque);//does not delete element from the queue
		
		System.out.println("Deque Pop:" + deque.pop());//first element
		System.out.println("Deque After Pop:" + deque);//deletes after pop
		
		System.out.println("Deque Contains Two:" + deque.contains("Two"));
		
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque After removing first and last element" +deque );
		
		
		
	}
	

}
