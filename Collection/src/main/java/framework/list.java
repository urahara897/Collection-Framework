package framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class list {
	
	@Test
	public void test1() {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(77);
		values.add(5);
		values.add(35);
		values.add(97);
		values.add(1, 78);
		values.add(3, 45);
		
		Collections.sort(values);
		
		for(int i : values)
		{
			
			System.out.println(i);
			
		}
		
	}
	
			

}
