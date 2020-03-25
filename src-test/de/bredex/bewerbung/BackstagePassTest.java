package de.bredex.bewerbung;

import static org.junit.Assert.*;

import org.junit.Test;

public class BackstagePassTest {

	@Test
	public void testQualityIncreases11daysBefore() {
		BackstagePass backstagePass = new BackstagePass("Kreator - Hordes of Chaos Tour", 11, 6);
		backstagePass.aging();
		assertEquals(7, backstagePass.getQuality());
	}
	
	@Test
	public void testQualityIncreases10daysBefore() {
		BackstagePass backstagePass = new BackstagePass("Subscribe", 10, 6);
		backstagePass.aging();
		assertEquals(8, backstagePass.getQuality());
	}
	
	@Test
	public void testQualityIncreases6daysBefore() {
		BackstagePass backstagePass = new BackstagePass("Metallica", 6, 6);
		backstagePass.aging();
		assertEquals(8, backstagePass.getQuality());
	}
	
	@Test
	public void testQualityIncreases5daysBefore() {
		BackstagePass backstagePass = new BackstagePass("Alvin es a Mokusok", 5, 6);
		backstagePass.aging();
		assertEquals(9, backstagePass.getQuality());
	}
	
	@Test
	public void testQualityIncreases1dayBefore() {
		BackstagePass backstagePass = new BackstagePass("Slipknot", 1, 6);
		backstagePass.aging();
		assertEquals(9, backstagePass.getQuality());
	}
	
	@Test
	public void testQualityLost0dayBefore() {
		BackstagePass backstagePass = new BackstagePass("Kadlot Karcsi", 0, 6);
		backstagePass.aging();
		assertEquals(0, backstagePass.getQuality());
	}

}
