package de.bredex.bewerbung;

import java.util.List;


public class GildedRose {

	private static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
	private static final String ELIXIR_OF_THE_MONGOOSE = "Elixir of the Mongoose";
	private static final String _5_DEXTERITY_VEST = "+5 Dexterity Vest";
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	public static List<NormalItem> items = null;

	public static void main(String[] args) {
		items = List.of(
				new NormalItem(_5_DEXTERITY_VEST, 10, 20),
				new AgedBrie(AGED_BRIE, 2, 0),
				new NormalItem(ELIXIR_OF_THE_MONGOOSE, 5, 7),
				new Sulfuras(SULFURAS_HAND_OF_RAGNAROS, 0, 80),
				new BackstagePass(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT, 15, 20),
				new Conjured(CONJURED_MANA_CAKE, 5, 20));

		updateQuality();
	}


	public static void updateQuality()
	{
		items.stream().forEach(NormalItem::aging);
	}
}