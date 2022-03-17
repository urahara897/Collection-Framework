package framework;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Test;

public class collection {

	@Test(priority = 1)
	public void test1() {
		int values[] = new int[4];
		Object values1[] = new Object[4];
		values1[0] = "Rudro";
		values1[1] = 77;
		
		Collection<Integer> values2 = new ArrayList<Integer>();
		values2.add(5);
		values2.add(77);
		values2.add(35);
		values2.add(97);
		
		//Collections.sort(values2);
		
		//Iterator i =values2.iterator();
		
		/*while(i.hasNext())
		{
			
			System.out.println(i.hasNext());
			
			
		}*/
		
		for(int j : values2)
		{
			
			System.out.println(j);
			
		}
		
	}
	
}
