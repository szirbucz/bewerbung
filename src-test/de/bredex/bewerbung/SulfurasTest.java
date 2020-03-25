package de.bredex.bewerbung;

import static org.junit.Assert.*;

import org.junit.Test;

public class SulfurasTest {

	@Test
	public void testSulfurasQualityNeverChanges() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", 2, 20);
		sulfuras.aging();
		assertEquals(20, sulfuras.getQuality());
	}
	
	@Test
	public void testSulfurasSellInNeverChanges() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", 2, 20);
		sulfuras.aging();
		assertEquals(2, sulfuras.getSellIn());
	}

}
