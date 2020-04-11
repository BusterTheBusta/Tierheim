package business;

import java.util.Date;

public class Tier {
	
	private String name;
	private int alter;
	private Date ImTierheimSeit;

	public Tier(String name, int alter, Date AufnahmeDatum) {
		this.name = name;
		this.alter = alter;
		this.ImTierheimSeit = AufnahmeDatum;
		this.Tier(this.name);
		
	}

	
	public void Tier(String name) {
		// Wofür gibt es diese Methode?
	}
}
