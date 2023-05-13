package Junits;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class AnnotationsExample {
	
	@BeforeAll
	public static void Beforeall() {
		System.out.println("Before ALL");
	}
	
	@BeforeEach
	public void brforejunit() {
		System.out.println("Before Junit");
	}
	@DisplayName("one positive num and one nagative test")
	@Test
	public void test1() {
		
		int result = Calculator.add(9, -6);
		Assertions.assertEquals(3, result);
	}
	@DisplayName("second test ")
	@Test
	public void test2() {
		
		int result = Calculator.add(9, -6);
		Assertions.assertEquals(3, result);
	}
	@AfterEach
	public void afterjunit() {
		System.out.println("After Junit");
	}
	@AfterAll
	public static void Afterall() {
		System.out.println("After ALL");
	}
	
}
