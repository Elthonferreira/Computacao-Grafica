import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Desenhos {

	public static void le_arquivo (String nome_arquivo) throws IOException {
		
		String path = "formas/" + nome_arquivo + ".byu";
		
		BufferedReader leitor = new BufferedReader(new FileReader(path));
		
		
	}
}
