import java.util.Scanner;

public class Biblioteca {

	public static void main(String args[]) {
		multiplicar_matriz();
		
	}

	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 * 		    Multiplicação de matrizes 
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	public static void multiplicar_matriz() {

		Scanner ler = new Scanner(System.in);
		int i = 0, j = 0;
		System.out.print("Quantidade de linhas da Matriz 1: ");
		int linham1 = ler.nextInt();
		System.out.print("Quantidade de colunas da Matriz 1: ");
		int colunam1 = ler.nextInt();
		System.out.print("Quantidade de linhas da Matriz 2: ");
		int linham2 = ler.nextInt();
		System.out.print("Quantidade de colunas da Matriz 2: ");
		int colunam2 = ler.nextInt();

		if (linham2 != colunam1) {
			System.out.println("O número de colunas da matriz 1, tem que ser igual"
					+ "ao número de linhas da matriz 2. \nTente novamente!");
			System.exit(0);
		}

		double m1[][] = new double[linham1][colunam1];
		double m2[][] = new double[linham2][colunam2];

		// Adição dos valores na matriz 1
		System.out.println("Informe os valores da Matriz 1.");
		for (i = 0; i < linham1; i++) {
			for (j = 0; j < colunam1; j++) {
				System.out.print("m1[" + i + "]" + "[" + j + "]: ");
				m1[i][j] = ler.nextDouble();
			}
		}

		// Adição dos valores na matriz 2
		System.out.println("Informe os valores da Matriz 2.");
		for (i = 0; i < linham2; i++) {
			for (j = 0; j < colunam2; j++) {
				System.out.print("m2[" + i + "]" + "[" + j + "]: ");
				m2[i][j] = ler.nextDouble();
			}
		}

		int linham3 = linham1;
		int colunam3 = colunam2;
		double m3[][] = new double[linham3][colunam3];
		double aux = 0;
		int x = 0;

		// Multiplicação
		for (i = 0; i < colunam3; i++) {
			for (j = 0; j < linham3; j++) {
				m3[i][j] = 0;
				for (x = 0; x < linham2; x++) {
					aux = aux + (m1[i][x] * m2[x][j]);
				}
				m3[i][j] = aux;
				aux = 0;
			}
		}
	
		// Imprime resultado
		System.out.println("\n");
		boolean change = false;
		for (i = 0; i < colunam3; i++) {
			for (j = 0; j < linham3; j++) {
				if (change == true)  {System.out.println("\n");}		
				System.out.printf("%.2f ", m3[i][j]);
				change = false;
			}
			change = true;
		}
	}

	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 
	 * 		Subtração de pontos 3D (retorna um vetor 3D)
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */

	public static double[] sub_pontos3d(double v1[], double v2[]) {

		double v3[] = new double[3];
		for (int i = 0; i < 3; i++) {
			v3[i] = v1[i] - v2[i];
		}
		return v3;
	}
	
	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 
	 * 	          Produto escalar de dois vetores 3D
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	
	public static double prod_escalar(double v1[], double v2[]) {
		
		double result = 0;
		for (int i = 0; i < v1.length; i++) {
			result = result + (v1[i] * v2[i]);
		}
		return result;	
	}
	
	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 
	 * 	          Produto vetorial de dois vetores 3D
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	
	public static double[] prod_vetorial(double v1[], double v2[]) {
		double v3 [] = new double [v1.length];
		
		v3[0] = (v1[1]*v2[2]) - (v1[2]*v2[1]);
		v3[1] = (v1[2]*v2[0]) - (v1[0]*v2[2]);
		v3[2] = (v1[0]*v2[1]) - (v1[1]*v2[0]);
		
		return v3;
	}

	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 
	 * 	         		 Norma de um vetor 3D
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	
	public static double norma_vetor(double v[]) {
		
		double result = Math.sqrt((Math.pow(v[0],2) + Math.pow(v[1], 2) + Math.pow(v[2], 2)));
		return result;
	}
	
	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 * 				 Normalização de um vetor 3D 
	 * 			 (retorna vetor 3D com norma unitária)
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	
	public static double[] normalização_vetor(double v[]) {
		
		double v1 [] = new double [3];
		v1 [0] = (v[0])/norma_vetor(v);
		v1 [1] = (v[1])/norma_vetor(v);
		v1 [2] = (v[2])/norma_vetor(v);
		return v1;		
	}
	
	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 *    Calcular coordenada baricêntrica de um ponto 2D  com 
	 *        relação a outros três pontos 2D não-colineares
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	
	public static double[] coord_bari(double v[]) {
		
		double v1 [] = new double [0];
		// TO DO
		return v1;		
	}	
	
	/*
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 *    Calcular coordenada cartesiana de um ponto 2D a partir 
	 *       de sua coordenada baricêntrica com relação a outros
	 *     			três pontos 2D não-colineares.
	 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	 */
	
	public static double[] coord_bari2(double v[]) {
		
		double v1 [] = new double [0];
		// TO DO
		return v1;		
	}

}
