package de.bredex.bewerbung;

public class AgedBrie extends NormalItem {

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	@Override
	public void updateQuality() {
		++this.quality;
	}

}
