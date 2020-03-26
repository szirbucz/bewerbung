package de.bredex.bewerbung;

public class Sulfuras extends NormalItem {

	private static final int SULFURAS_QUALITY = 80;

	public Sulfuras(String name, int sellIn) {
		super(name, sellIn, SULFURAS_QUALITY);
	}
	
	public void updateQuality() {
	}
	
	public void updateSellIn() {
	}
	
	public int getNormalizedQuality() {
		return this.quality;
	}

}
