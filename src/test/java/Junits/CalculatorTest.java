package Junits;

import org.junit.jupiter.api.Test;

import code.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

public class CalculatorTest {

	@DisplayName("Add two positive numbers Test")
	@Test
	@Tag("Sanity")
	@Tag("Regression")
	public void test1()
	{
		int result = Calculator.add(78, 23);
		Assertions.assertEquals(101,result);
	}
	
	//@Disabled
	@DisplayName("Add two negative numbers Test")
	@RepeatedTest(3)
	public void test2()
	{
		int result = Calculator.add(-20, 23);
		Assertions.assertEquals(3,result);
	}
	
	@DisplayName("Add two positive numbers where result is not matching Test")
	@Test
	@Tag("Regression")
	public void test3()
	{
		int result = Calculator.add(54, 20);
		Assertions.assertNotEquals(75,result);
	}
	
	@CustomAnnotation
	public void test4()
	{
		System.out.println("Running the test case as custom annotation");
	}
}