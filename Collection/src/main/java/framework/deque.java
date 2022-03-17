package framework;

import java.util.ArrayDeque;
import java.util.Deque;

import org.testng.annotations.Test;

public class deque {

	@Test
	public void test1() {
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		//Traversing elements
		for (String str : deque) {
		System.out.println(str);
		}
		
	}
	
}
