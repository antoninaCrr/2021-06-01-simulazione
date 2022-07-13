package it.polito.tdp.genes.model;

public class Arco {

	private Genes g1;
	private Genes g2;
	private Double arco;
	
	public Arco(Genes g1, Genes g2, Double arco) {
		super();
		this.g1 = g1;
		this.g2 = g2;
		this.arco = arco;
	}

	public Genes getG1() {
		return g1;
	}

	public void setG1(Genes g1) {
		this.g1 = g1;
	}

	public Genes getG2() {
		return g2;
	}

	public void setG2(Genes g2) {
		this.g2 = g2;
	}

	public Double getArco() {
		return arco;
	}

	public void setArco(Double arco) {
		this.arco = arco;
	}
	
	
	
	
}
