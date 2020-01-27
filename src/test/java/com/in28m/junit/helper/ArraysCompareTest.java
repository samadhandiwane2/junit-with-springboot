package com.in28m.junit.helper;

import static org.junit.jupiter.api.Assertions.*;
import static java.time.Duration.ofMillis;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysCompareTest {

	@Test
	void testArraySort_RandomArray() {
		int[] numbers = {12, 3, 4, 1};
		int[] expected = {1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
		
		// Compares objects rather than values 
		/* assertEquals(expected, numbers); */
	}
	
	@Test
	void testArraySort_NullArray() {
		int[] numbers = null;
		assertThrows(RuntimeException.class, () -> {
			Arrays.sort(numbers);
	    });		
	}
	
	@Test
	void testSort_Performance() {
		int[] numbers = {21, 2, 45};
		assertTimeout(ofMillis(100), () -> {
			for(int i = 0; i< 100000; i++) {
				numbers[0] = i;
				Arrays.sort(numbers);
			}
	    });
				
	}

}
