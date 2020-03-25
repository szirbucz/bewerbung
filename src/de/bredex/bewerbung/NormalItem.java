package de.bredex.bewerbung;


public class NormalItem extends Item {

	private static final int MAX_QUALITY = 50;
	private static final int MIN_QUALITY = 0;
	
	public NormalItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	
	protected void updateQuality() {
    	this.quality -= this.sellIn > 0 ? 1 : 2;
    }
    
    protected void updateSellIn() {
    	--this.sellIn;
    }
    
    public void aging() {
    	updateQuality();
    	updateSellIn();
    	this.quality = this.getNormalizedQuality();
    }
    
	
	protected int getNormalizedQuality() {
		return this.quality < MIN_QUALITY ?
				MIN_QUALITY :
				this.quality > MAX_QUALITY ?
						MAX_QUALITY :
						this.quality; 
		
	}

}
