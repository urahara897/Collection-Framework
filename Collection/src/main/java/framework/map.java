package framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class map {
	
	@Test(priority = 1)
	public void test1() {
		
		Map<String,String> map = new HashMap();//takes 2 generic values k and v, k as key and v as value so key value pair
		map.put("myName", "Rudro");//(key,value)
		map.put("favouriteNumber", "77");
		map.put("residence", "Bangalore");
		
		System.out.println(map);
		
		
	}
	
	@Test(priority = 2)
	public void test2() {
		
		Map<String,String> map = new HashMap();//takes 2 generic values k and v, k as key and v as value so key value pair
		map.put("myName", "Rudro");//(key,value)
		map.put("favouriteNumber", "77");
		map.put("residence", "Bangalore");

		System.out.println(map.get("residence"));
		System.out.println(map.get("myName"));
		System.out.println(map.get("favouriteNumber"));
		System.out.println(map.get("random"));//no such key so will get null and not any exception etc
		
		
	}

	@Test(priority = 3)
	public void test3() {
		
		Map<String,String> map = new HashMap();//takes 2 generic values k and v, k as key and v as value so key value pair
		map.put("myName", "Rudro");//(key,value)
		map.put("favouriteNumber", "77");
		map.put("residence", "Bangalore");
		Set<String> keys =  map.keySet();
		
		for(String key :keys)
		{
			
			System.out.println(key + " " + map.get(key));
			
		}
		
	}
	
	@Test(priority = 4)
	public void test4() {
		
		Map<String,String> map = new HashMap();//takes 2 generic values k and v, k as key and v as value so key value pair
		map.put("myName", "Rudro");//(key,value)
		map.put("favouriteNumber", "77");
		map.put("residence", "Bangalore");
		map.put("residence", "Kolkata");//overwrites
		Set<String> keys =  map.keySet();//gives the set of keys and store values in a set
		
		for(String key :keys)
		{
			
			System.out.println(key + " " + map.get(key));
			
		}
		
	}
	
	@Test(priority = 5)
	public void test5() {
		
		Map<String,String> map = new Hashtable();//is synchronised for thread safety
		System.out.println("Hashtable");
		map.put("myName", "Rudro");//(key,value)
		map.put("favouriteNumber", "77");
		map.put("residence", "Bangalore");
		map.put("residence", "Kolkata");//overwrites
		Set<String> keys =  map.keySet();
		
		for(String key :keys)
		{
			
			System.out.println(key + " " + map.get(key));
			
		}
		
		
	}
}
