package framework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class set {

	@Test(priority = 1)
	public void test1() {
		
		Set<Integer> values = new HashSet<>();//Hashset is a class which implements set
		values.add(7);
		values.add(89);
		values.add(78);
		values.add(7);
		
		for(int i : values)
		{
			
			System.out.println(i);
			
		}
		
	}
	
	@Test(priority = 2)
	public void test2() {
		
		Set<Integer> values = new HashSet<>();
		System.out.println(values.add(7));
		System.out.println(values.add(89));
		System.out.println(values.add(78));
		System.out.println(values.add(7));
		
	}
	
	@Test(priority = 3)
	public void test3() {
		
		Set<Integer> values = new HashSet<>();//does not save in proper sequence
		System.out.println(values.add(87));
		System.out.println(values.add(97));
		System.out.println(values.add(34));
		System.out.println(values.add(92));
		
		for(int i : values)
		{
			
			System.out.println(i);
			
		}
		
	}
	
	@Test(priority = 4)
	public void test4() {
		
		Set<Integer> values = new TreeSet<>();//gives data in sequence(ascending order)
		System.out.println("TreeSet");
		values.add(87);
		values.add(97);
		values.add(34);
		values.add(92);
		
		for(int i : values)
		{
			
			System.out.println(i);
			
		}
		
	}
	
}
