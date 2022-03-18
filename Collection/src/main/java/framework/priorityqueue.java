package framework;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class priorityqueue {

	@Test(priority = 1)
	public void test1() {
		
		System.out.println("Minheap");
		PriorityQueue<String> queue=new PriorityQueue<String>();//Minheap
		queue.add("CEO");
		queue.add("Manager");
		queue.add("Developer");
		queue.add("Tester");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the elements:");
		Iterator itr=queue.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
		System.out.println(itr2.next());
		
	}
	}
		
	@Test(priority = 2)
	public void test2() {
		
		PriorityQueue<String> queue=new PriorityQueue<String>(Collections.reverseOrder());//Maxheap
		System.out.println("Maxheap");
		queue.add("CEO");
		queue.add("Manager");
		queue.add("Developer");
		queue.add("Tester");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the elements:");
		Iterator itr=queue.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
		System.out.println(itr2.next());
		
	}
		
	}
	
	}
	