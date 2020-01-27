package com.in28m.junit.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringHelperTest {
	
	StringHelper helper;
	
	@BeforeEach
	public void setup() {
		helper = new StringHelper();
	}
	
	// AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("BC", helper.truncateAInFirst2Positions("ABC"));
	}
	
	// ABCD => false, ABAB => true, AB => true, A => false	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
