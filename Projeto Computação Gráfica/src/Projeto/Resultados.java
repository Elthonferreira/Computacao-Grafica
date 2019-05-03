package Projeto;

public class Resultados extends Biblioteca{
	
	public static void main (String args[]) {
		
	/* Resultado multiplicar_matriz (Letra a) */	
	double m1 [][] = {{1.5, 2.5, 3.5}, {4.5, 5.5, 6.5}};
	double m2 [][] = {{7.5, 8.5}, {9.5, 10.5}, {11.5, 12.5}};
	System.out.print("Letra a) ");
	imprime_matriz(multiplicar_matriz(m1, m2));
	
	/* Resultado subtração pontos (Letra b) */
	System.out.println("---------------------------------------------\n");
	double p1 [] = {3.5, 1.5, 2.0};
	double p2 [] = {1.0, 2.0, 1.5};
	System.out.print("Letra b) ");
	imprime_vetor(sub_pontos3d(p1, p2));
	
	/* Resultado produto escalar (Letra c) */
	System.out.println("---------------------------------------------\n");
	double p3 [] = {3.5, 1.5, 2.0};
	double p4 [] = {1.0, 2.0, 1.5};
	System.out.print("Letra c) ");
	System.out.println(prod_escalar(p3, p4));

	/* Resultado produto vetorial (Letra d) */
	System.out.println("\n---------------------------------------------\n");
	double p5 [] = {3.5, 1.5, 2.0};
	double p6 [] = {1.0, 2.0, 1.5};
	System.out.print("Letra d) ");
	imprime_vetor(prod_vetorial(p5, p6));
	
	/* Resultado da norma (Letra e) */
	System.out.println("---------------------------------------------\n");
	double v1 [] = {3.5, 1.5, 2.0};
	System.out.print("Letra e) ");
	System.out.printf("%.2f", norma_vetor(v1));

	/* Resultado do vetor resultante (Letra f) */
	System.out.println("\n\n---------------------------------------------\n");
	double v2 [] = {3.5, 1.5, 2.0};
	System.out.print("Letra f) ");
	imprime_vetor(normalização_vetor(v2));
	
	/* Resultado coord_bari (Letra g) */
	System.out.println("---------------------------------------------\n");
	double b1 [] = {-0.25, 0.75};
	double b2 [] = {-1.0, 1.0};
	double b3 [] = {0.0, -1.0};
	double b4 [] = {1.0, 1.0};
	System.out.print("Letra g) ");
	imprime_vetor(coord_bari(b1, b2, b3, b4));	
	
	/* Resultado coord_carte (Letra h) */
	System.out.println("---------------------------------------------\n");
	double c1 [] = {0.5, 0.25, 0.25};
	double c2 [] = {-1.0, 1.0};
	double c3 [] = {0.0, -1.0};
	double c4 [] = {1.0, 1.0};
	System.out.print("Letra h) ");
	imprime_vetor(coord_carte(c1, c2, c3, c4));	
	System.out.println("---------------------------------------------\n");
		
	}
}
