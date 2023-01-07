package parallelexecution;

import org.testng.annotations.Test;

public class parallelexeccution3 {

	
	
	@Test
	public void testMethod9() {
		System.out.println("TestClass1 >> testMethod9 >> " +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod10() {
		System.out.println("TestClass1 >> testMethod10 >> " +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod11() {
		System.out.println("TestClass1 >> testMethod11 >> " +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod12() {
		System.out.println("TestClass1 >> testMethod12 >> " +Thread.currentThread().getId());
}}
