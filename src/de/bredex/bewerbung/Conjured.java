package de.bredex.bewerbung;

public class Conjured extends NormalItem {

	public Conjured(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	@Override
	public void updateQuality() {
		super.updateQuality();
		super.updateQuality();
	}

	
}
