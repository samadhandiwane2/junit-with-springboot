package com.in28m.junit.helper;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickBeforeAfterTest {
	
	@BeforeAll //@BeforeClass in JUnit4
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeEach //@Before in JUnit4
	public void setup() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}
	
	@AfterEach //@After in JUnit4
	public void tearout() {
		System.out.println("After Test");
	}
	
	@AfterAll //@BeforeClass in JUnit4
	public static void afterClass() {
		System.out.println("After Class");
	}

}
