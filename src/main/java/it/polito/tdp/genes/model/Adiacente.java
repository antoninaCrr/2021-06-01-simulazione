package it.polito.tdp.genes.model;

public class Adiacente implements Comparable<Adiacente> {

	private Genes ad;
	private Double peso;
	
	public Adiacente(Genes ad, Double peso) {
		super();
		this.ad = ad;
		this.peso = peso;
	}

	public Genes getAd() {
		return ad;
	}

	public void setAd(Genes ad) {
		this.ad = ad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return ad.toString()+" "+this.peso;
	}

	@Override
	public int compareTo(Adiacente o) {
		// TODO Auto-generated method stub
		return o.getPeso().compareTo(this.peso);
	}
	
	
	
	
	
	
}
