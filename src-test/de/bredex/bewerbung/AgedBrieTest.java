package de.bredex.bewerbung;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgedBrieTest {

	@Test
	public void testQualityIsIncreasingByAging() {
		AgedBrie agedBrie = new AgedBrie("BrieDuBriton", 5, 6);
		agedBrie.aging();
		assertEquals(7, agedBrie.getQuality());
	}
	
	@Test
	public void testQualityCantBeMoreThan50() {
		AgedBrie agedBrie = new AgedBrie("BrieDuBriton", 5, 50);
		agedBrie.aging();
		assertEquals(50, agedBrie.getQuality());
	}
	
	

}
