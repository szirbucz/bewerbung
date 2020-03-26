package de.bredex.bewerbung;

import static org.junit.Assert.*;

import org.junit.Test;

public class SulfurasTest {

	@Test
	public void testSulfurasQualityIs80() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", 2);
		sulfuras.aging();
		assertEquals(80, sulfuras.getQuality());
	}
	
	@Test
	public void testSulfurasSellInNeverChanges() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", 2);
		sulfuras.aging();
		assertEquals(2, sulfuras.getSellIn());
	}

}
