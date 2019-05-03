package Beans;

import java.util.ArrayList;

public class Salvar {

	// Atributos
	public ArrayList<Ponto> pontos;
	public ArrayList<int []> indice;
	
	// Construtor
	public Salvar(ArrayList<Ponto> pontos, ArrayList<int []> indice) {
		this.pontos = pontos;
		this.indice = indice;
	}
}
