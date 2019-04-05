import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Desenhos {

	public static void le_arquivo (String nome_arquivo) throws IOException {
		
		// Leitura dos arquivos
		String path = "formas/" + nome_arquivo + ".byu";
		BufferedReader leitor = new BufferedReader(new FileReader(path));
		
		// Get dados
		String line = leitor.readLine();
		String split [] = line.split(" ");
		
		ArrayList<Point> points = new ArrayList<>(); 
	}
}
