package Beans;

import java.util.ArrayList;

public class Salvar {

	// Atributos
	public ArrayList<Ponto> pontos;
	public ArrayList<Triangulo> triangulos;
	
	// Construtor
	public Salvar(ArrayList<Ponto> pontos, ArrayList<Triangulo> triangulos) {
		this.pontos = pontos;
		this.triangulos = triangulos;
	}
}
