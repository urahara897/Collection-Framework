package framework;

import java.util.ArrayDeque;
import java.util.Deque;

import org.testng.annotations.Test;

public class deque {

	@Test
	public void test1() {
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("77");
		deque.add("90");
		deque.add("97");
		//Traversing elements
		for (String str : deque) {
			
		System.out.println(str);
		
		}
		
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		deque.addFirst("100");
		deque.addLast("80");
		
		System.out.println("After Editing");
		System.out.println("Get First" + deque.getFirst());
		System.out.println("Get Last" +deque.getLast());
		
		System.out.println("Peek First" + deque.peekFirst());
		System.out.println("Peek Last" + deque.peekLast());
		
	}
	
}
