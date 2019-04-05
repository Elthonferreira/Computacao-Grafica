import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Desenhos {

	public static void le_arquivo (String nome_arquivo) throws IOException {
		
		String path = "formas/" + nome_arquivo + ".byu";
		
		BufferedReader leitor = new BufferedReader(new FileReader(path));
		
		String aux = leitor.readLine();
		String aux2[] = aux.split(" ");
		System.out.println("" + aux2[0] + "\n" + aux2[1]);
		int tamanho1 = Integer.parseInt(aux2[0]);
		int tamanho2 = Integer.parseInt(aux2[1]);

		for (int i = 0; i < tamanho1; i++) {
			
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
