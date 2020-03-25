package de.bredex.bewerbung;

public class Item {
    private static final int MAX_QUALITY = 50;
	private static final int MIN_QUALITY = 0;
	public String name;
	public int sellIn; 
    public int quality; 
    
    public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}
    
    
	private int getNormalizedQuality() {
		return this.quality < MIN_QUALITY ?
				MIN_QUALITY :
				this.quality > MAX_QUALITY ?
						MAX_QUALITY :
						this.quality; 
		
	}

	/* Generated getter and setter code */
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSellIn() {
		return sellIn;
	}
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
}
