package it.polito.tdp.genes.model;

public class Interaction {

	private String gen1;
	private String gen2;
	private String type;
	private double correlazione;
	
	public Interaction(String gen1, String gen2, String type, double correlazione) {
		super();
		this.gen1 = gen1;
		this.gen2 = gen2;
		this.type = type;
		this.correlazione = correlazione;
	}

	public String getGen1() {
		return gen1;
	}

	public void setGen1(String gen1) {
		this.gen1 = gen1;
	}

	public String getGen2() {
		return gen2;
	}

	public void setGen2(String gen2) {
		this.gen2 = gen2;
	}

	public double getCorrelazione() {
		return correlazione;
	}

	public void setCorrelazione(double correlazione) {
		this.correlazione = correlazione;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
		
}
