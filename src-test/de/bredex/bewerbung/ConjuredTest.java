package de.bredex.bewerbung;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConjuredTest {

	@Test
	public void testQualityDecreaseBy2WhenSellInIsPositive() {
		Conjured conjured = new Conjured("Conjured", 3, 3);
		conjured.aging();
		assertEquals(1, conjured.getQuality());
	}
	
	@Test
	public void testQualityDecreaseBy4WhenSellInIsOver() {
		Conjured conjured = new Conjured("Conjured", 0, 6);
		conjured.aging();
		assertEquals(2, conjured.getQuality());
	}

}
