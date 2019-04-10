import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Beans.Ponto;
import Beans.Salvar;
import Beans.Triangulo;

public class Desenhos {

	public static Salvar le_arquivo(String nome_arquivo) throws IOException {

		// Leitura dos arquivos
		String path = "formas/" + nome_arquivo + ".byu";
		BufferedReader leitor = new BufferedReader(new FileReader(path)); // Leitor

		String aux = leitor.readLine(); // Lê valores e guarda no vetor aux
		String aux2[] = aux.split(" "); // Separa com espaços e guarda no vetor aux2
		//System.out.println("" + aux2[0] + "\n" + aux2[1]);
		int qtd_pontos = Integer.parseInt(aux2[0]); 
		int qtd_triangulos = Integer.parseInt(aux2[1]);

		ArrayList<Ponto> pontos = new ArrayList<>();
		ArrayList<Triangulo> triangulos = new ArrayList<>();

		// Adicionando os pontos no array de pontos
		for (int i = 0; i < qtd_pontos; i++) {
			aux = leitor.readLine();
			aux2 = aux.split(" ");
			Ponto p = new Ponto(Double.parseDouble(aux2[0]), 
								Double.parseDouble(aux2[1]), 
								Double.parseDouble(aux2[2]));
			pontos.add(p);
		}
		
		// Adicionando os triângulos no array de triângulos
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
	// Função de normalização
	public static Salvar normalizacao (Salvar s, int width, int length) {
		double minx = s.pontos.get(0).x;
		double miny = s.pontos.get(0).y;
		double maxx = s.pontos.get(0).x;
		double maxy = s.pontos.get(0).y;
		// Comparando máx e min
		for (int i = 0; i < s.pontos.size(); i++) { 
			if (s.pontos.get(i).x < minx) minx = s.pontos.get(i).x;
			if (s.pontos.get(i).y < miny) miny = s.pontos.get(i).y;
			if (s.pontos.get(i).x > maxx) maxx = s.pontos.get(i).x;
			if (s.pontos.get(i).y > maxy) maxy = s.pontos.get(i).y;
		}
		// Fórmula
		for (int j = 0; j < s.pontos.size(); j++) {
			s.pontos.get(j).x = ((s.pontos.get(j).x - minx)/(maxx - minx))*(width - 1);
			s.pontos.get(j).y = ((s.pontos.get(j).y - miny)/(maxy - miny))*(length - 1);
		}
		return s;
	}
}
