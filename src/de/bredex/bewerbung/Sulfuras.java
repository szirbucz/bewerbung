package de.bredex.bewerbung;

public class Sulfuras extends NormalItem {

	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	public void updateQuality() {
	}
	
	public void updateSellIn() {
	}
	
	public int getNormalizedQuality() {
		return this.quality;
	}

}
