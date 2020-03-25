package de.bredex.bewerbung;

public class BackstagePass extends NormalItem {

	public BackstagePass(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	@Override
	public void updateQuality() {
		if (sellIn > 0) {
			this.quality += getQualithyIncreasement();
		} else {
			this.quality = 0;
		}
	}

	private int getQualithyIncreasement() {
		return this.sellIn > 10 ?
				1 :
				this.sellIn > 5 ?
						2 :
						3;
	}

}
