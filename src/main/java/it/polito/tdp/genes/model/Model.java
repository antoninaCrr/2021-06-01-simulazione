package it.polito.tdp.genes.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.genes.db.GenesDao;

public class Model {
	
	private GenesDao dao;
	private Graph<Genes,DefaultWeightedEdge> grafo;
	private Map<String,Genes> geniMap;
	
	public Model() {
		super();
		this.dao = new GenesDao();
	}
	
	public void creaGrafo() {
		this.grafo = new SimpleWeightedGraph<Genes,DefaultWeightedEdge>(DefaultWeightedEdge.class);
		this.geniMap = new HashMap<>();
		
		// vertici
		Graphs.addAllVertices(this.grafo, dao.getGenesEssential(geniMap));
		
		// archi
		for(Arco ai : dao.getInteractions(geniMap)) {
			if(ai.getG1().getChromosome() == ai.getG2().getChromosome()) {
				Graphs.addEdgeWithVertices(this.grafo, ai.getG1(), ai.getG2(),2*ai.getArco()); //Arco è il peso -- definito così per errore
			}else {
				Graphs.addEdgeWithVertices(this.grafo, ai.getG1(), ai.getG2(), ai.getArco());
			}
		}
		
		System.out.println("GRAFO CREATO: "+this.grafo.vertexSet().size()+" vertici, "+this.grafo.edgeSet().size()+" archi\n");
		
	}
	
	public int getNVertici() {
		return this.grafo.vertexSet().size();
	}
	
	public int getNArchi() {
		return this.grafo.edgeSet().size();
	}
	
	public List<Genes> getVertici(){
		List<Genes> vertici = new ArrayList<>(this.grafo.vertexSet());
		Collections.sort(vertici);
		return vertici;
	}
	
	public List<Adiacente> getAdiacenze(Genes g){
		List<Adiacente> result = new ArrayList<>();
		
		for(Genes gi : Graphs.neighborListOf(this.grafo, g)) {
			double peso = 0.0;
			peso = this.grafo.getEdgeWeight(this.grafo.getEdge(g, gi));
			Adiacente a = new Adiacente(gi, peso);
			result.add(a);
		}
		
		Collections.sort(result);
		
		return result;
	}
	
	
	
	
	

	
	
	
	
}
