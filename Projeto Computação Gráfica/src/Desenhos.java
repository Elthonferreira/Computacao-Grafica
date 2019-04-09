import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Beans.Ponto;

public class Desenhos {

	public static void le_arquivo (String nome_arquivo) throws IOException {
		
		// Leitura dos arquivos
		String path = "formas/" + nome_arquivo + ".byu";
		BufferedReader leitor = new BufferedReader(new FileReader(path));
		
		String aux = leitor.readLine();
		String aux2[] = aux.split(" ");
		System.out.println("" + aux2[0] + "\n" + aux2[1]);
		int qtd_pontos = Integer.parseInt(aux2[0]);
		int qtd_triangulos = Integer.parseInt(aux2[1]);
		ArrayList<Ponto> pontos = new ArrayList<>();

		for (int i = 0; i < qtd_pontos; i++) {
			
		}
	}
		
	public static void main (String args[]) {
		try {
			le_arquivo("maca");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
