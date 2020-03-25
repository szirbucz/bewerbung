package de.bredex.bewerbung;

import static org.junit.Assert.*;

import org.junit.Test;

public class NormalItemTest {

	@Test
	public void testNormalItemShouldDecreaseSellInOnAging() {
		NormalItem NormalItem = new NormalItem("NormalItem", 4, 4);
		NormalItem.aging();
		assertEquals(3, NormalItem.getSellIn());
	}
	
	@Test
	public void testNormalItemShouldDecreaseQualityOnAging() {
		NormalItem NormalItem = new NormalItem("NormalItem", 4, 4);
		NormalItem.aging();
		assertEquals(3, NormalItem.getQuality());
	}
	
	@Test
	public void testNormalItemDecreaseQualityDoubled() {
		NormalItem NormalItem = new NormalItem("NormalItem", 0, 4);
		NormalItem.aging();
		assertEquals(2, NormalItem.getQuality());
	}

	@Test
	public void testNormalItemQualityMustNotBeNegative() {
		NormalItem NormalItem = new NormalItem("NormalItem", 2, 0);
		NormalItem.aging();
		assertEquals(0, NormalItem.getQuality());
	}
	
}
