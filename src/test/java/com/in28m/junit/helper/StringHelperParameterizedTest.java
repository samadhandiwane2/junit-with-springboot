package com.in28m.junit.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringHelperParameterizedTest {
	
	StringHelper helper = new StringHelper();

	@ParameterizedTest
	@ValueSource(strings = 	{"AACD", "CD", "ACD", "CD", "AD"}	)
	public void testTruncateAInFirst2Positions(String input) {
		assertEquals("CD", 
				helper.truncateAInFirst2Positions(input));
	}
	

}
