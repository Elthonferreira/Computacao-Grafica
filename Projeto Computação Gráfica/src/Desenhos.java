import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Beans.Ponto;
import Beans.Salvar;
import Beans.Triangulo;

public class Desenhos {

	public static Salvar le_arquivo (String nome_arquivo) throws IOException {
		
		// Leitura dos arquivos
		String path = "formas/" + nome_arquivo + ".byu";
		BufferedReader leitor = new BufferedReader(new FileReader(path));
		
		String aux = leitor.readLine();
		String aux2[] = aux.split(" ");
		System.out.println("" + aux2[0] + "\n" + aux2[1]);
		int qtd_pontos = Integer.parseInt(aux2[0]);
		int qtd_triangulos = Integer.parseInt(aux2[1]);
		
		ArrayList<Ponto> pontos = new ArrayList<>();
		ArrayList<Triangulo> triangulos = new ArrayList<>();
				
		for (int i = 0; i < qtd_pontos; i++) {
			aux = leitor.readLine();
			aux2 = aux.split(" ");
			Ponto p = new Ponto(Double.parseDouble(aux2[0]), 
								Double.parseDouble(aux2[1]), 
								Double.parseDouble(aux2[2]));
			pontos.add(p);	
		}
		
		for (int i = 0; i < qtd_triangulos; i++) {
			aux = leitor.readLine();
			aux2 = aux.split(" ");
			Triangulo t = new Triangulo(pontos.get(Integer.parseInt(aux2[0]) - 1), 
										pontos.get(Integer.parseInt(aux2[1]) - 1),
										pontos.get(Integer.parseInt(aux2[2]) - 1));
			triangulos.add(t);
		}
		Salvar save = new Salvar(pontos, triangulos);
		return save;
	}
		
	public static void main (String args[]) {
		try {
			le_arquivo("vaso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
