package parallelexecution;

import org.testng.annotations.Test;

public class parallelexeccution4 {

	
	
	@Test
	public void testMethod13() {
		System.out.println("TestClass1 >> testMethod13 >> " +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod14() {
		System.out.println("TestClass1 >> testMethod14 >> " +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod15() {
		System.out.println("TestClass1 >> testMethod15 >> " +Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod16() {
		System.out.println("TestClass1 >> testMethod16 >> " +Thread.currentThread().getId());
}}
