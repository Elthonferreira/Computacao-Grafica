package Beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Camera {
	
	public double v [] = new double[3];
	public double u [] = new double[3];
	public double n [] = new double[3];
	
	public Ponto c = new Ponto();
	public double d, hx, hy;
	
	public Camera (String arquivo) throws IOException {
		ler_arquivo(arquivo);		
	}
	
	
	public void ler_arquivo (String nome_arquivo) throws IOException {
		String path = "Camera/" + nome_arquivo + ".txt";
		BufferedReader leitor = new BufferedReader(new FileReader(path)); // Leitor
		
		String aux = leitor.readLine(); // Lê valores e guarda no vetor aux
		String aux2[] = aux.split(" "); // Separa com espaços e guarda no vetor aux2
	
		c.x = Double.parseDouble(aux2[0]);
		c.y = Double.parseDouble(aux2[1]);
		c.z = Double.parseDouble(aux2[2]);
		
		aux = leitor.readLine(); // Lê valores e guarda no vetor aux
		aux2 = aux.split(" ");   // Separa com espaços e guarda no vetor aux2
		
		n[0] = Double.parseDouble(aux2[0]);
		n[1] = Double.parseDouble(aux2[1]);
		n[2] = Double.parseDouble(aux2[2]);
		
		aux = leitor.readLine(); // Lê valores e guarda no vetor aux
		aux2 = aux.split(" ");   // Separa com espaços e guarda no vetor aux2

		v[0] = Double.parseDouble(aux2[0]);
		v[1] = Double.parseDouble(aux2[1]);
		v[2] = Double.parseDouble(aux2[2]);
		
		aux = leitor.readLine(); // Lê valores e guarda no vetor aux
		aux2 = aux.split(" ");   // Separa com espaços e guarda no vetor aux2
		
		d = Double.parseDouble(aux2[0]);
		
		aux = leitor.readLine(); // Lê valores e guarda no vetor aux
		aux2 = aux.split(" ");   // Separa com espaços e guarda no vetor aux2
		
		hx = Double.parseDouble(aux2[0]);
		
		aux = leitor.readLine(); // Lê valores e guarda no vetor aux
		aux2 = aux.split(" ");   // Separa com espaços e guarda no vetor aux2
		
		hy = Double.parseDouble(aux2[0]);
		
			System.out.println("c.x = " + c.x + "  c.y = " + c.y + "  c.z = " + c.z +
					"\nn[0] = " + n[0] + "  n[1] = " + n[1] + "  n[2] = " + n[2] + 
					"\nv[0] = " + v[0] + "  v[1] = " + v[1] + "  v[2] = " + v[2] + 
					"\nd = " + d + "\nhx = " + hx + "\nhy = " + hy);
	}

	public static void main(String[] args) throws IOException {
	//	ler_arquivo("camera");
		String separator = System.getProperty("file.separator");
		Camera cam = new Camera("camera");
		System.out.println();
	}

}
